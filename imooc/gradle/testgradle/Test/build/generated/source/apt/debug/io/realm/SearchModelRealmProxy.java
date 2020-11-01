package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class SearchModelRealmProxy extends com.imooc.viewpagertest.module.search.SearchModel
    implements RealmObjectProxy, SearchModelRealmProxyInterface {

    static final class SearchModelColumnInfo extends ColumnInfo {
        long uptimeIndex;
        long listIndex;

        SearchModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("SearchModel");
            this.uptimeIndex = addColumnDetails("uptime", objectSchemaInfo);
            this.listIndex = addColumnDetails("list", objectSchemaInfo);
        }

        SearchModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new SearchModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final SearchModelColumnInfo src = (SearchModelColumnInfo) rawSrc;
            final SearchModelColumnInfo dst = (SearchModelColumnInfo) rawDst;
            dst.uptimeIndex = src.uptimeIndex;
            dst.listIndex = src.listIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>(2);
        fieldNames.add("uptime");
        fieldNames.add("list");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    private SearchModelColumnInfo columnInfo;
    private ProxyState<com.imooc.viewpagertest.module.search.SearchModel> proxyState;
    private RealmList<com.imooc.viewpagertest.module.search.ProductModel> listRealmList;

    SearchModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (SearchModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.imooc.viewpagertest.module.search.SearchModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$uptime() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.uptimeIndex);
    }

    @Override
    public void realmSet$uptime(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.uptimeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.uptimeIndex, value);
    }

    @Override
    public RealmList<com.imooc.viewpagertest.module.search.ProductModel> realmGet$list() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (listRealmList != null) {
            return listRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.listIndex);
            listRealmList = new RealmList<com.imooc.viewpagertest.module.search.ProductModel>(com.imooc.viewpagertest.module.search.ProductModel.class, osList, proxyState.getRealm$realm());
            return listRealmList;
        }
    }

    @Override
    public void realmSet$list(RealmList<com.imooc.viewpagertest.module.search.ProductModel> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("list")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.imooc.viewpagertest.module.search.ProductModel> original = value;
                value = new RealmList<com.imooc.viewpagertest.module.search.ProductModel>();
                for (com.imooc.viewpagertest.module.search.ProductModel item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.listIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.imooc.viewpagertest.module.search.ProductModel linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.setRow(i, ((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        } else {
            osList.removeAll();
            if (value == null) {
                return;
            }
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.imooc.viewpagertest.module.search.ProductModel linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("SearchModel", 2, 0);
        builder.addPersistedProperty("uptime", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty("list", RealmFieldType.LIST, "ProductModel");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static SearchModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new SearchModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "SearchModel";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.imooc.viewpagertest.module.search.SearchModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        if (json.has("list")) {
            excludeFields.add("list");
        }
        com.imooc.viewpagertest.module.search.SearchModel obj = realm.createObjectInternal(com.imooc.viewpagertest.module.search.SearchModel.class, true, excludeFields);

        final SearchModelRealmProxyInterface objProxy = (SearchModelRealmProxyInterface) obj;
        if (json.has("uptime")) {
            if (json.isNull("uptime")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'uptime' to null.");
            } else {
                objProxy.realmSet$uptime((long) json.getLong("uptime"));
            }
        }
        if (json.has("list")) {
            if (json.isNull("list")) {
                objProxy.realmSet$list(null);
            } else {
                objProxy.realmGet$list().clear();
                JSONArray array = json.getJSONArray("list");
                for (int i = 0; i < array.length(); i++) {
                    com.imooc.viewpagertest.module.search.ProductModel item = ProductModelRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$list().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.imooc.viewpagertest.module.search.SearchModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.imooc.viewpagertest.module.search.SearchModel obj = new com.imooc.viewpagertest.module.search.SearchModel();
        final SearchModelRealmProxyInterface objProxy = (SearchModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("uptime")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$uptime((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'uptime' to null.");
                }
            } else if (name.equals("list")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$list(null);
                } else {
                    objProxy.realmSet$list(new RealmList<com.imooc.viewpagertest.module.search.ProductModel>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.imooc.viewpagertest.module.search.ProductModel item = ProductModelRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$list().add(item);
                    }
                    reader.endArray();
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    public static com.imooc.viewpagertest.module.search.SearchModel copyOrUpdate(Realm realm, com.imooc.viewpagertest.module.search.SearchModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.imooc.viewpagertest.module.search.SearchModel) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static com.imooc.viewpagertest.module.search.SearchModel copy(Realm realm, com.imooc.viewpagertest.module.search.SearchModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.imooc.viewpagertest.module.search.SearchModel) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.imooc.viewpagertest.module.search.SearchModel realmObject = realm.createObjectInternal(com.imooc.viewpagertest.module.search.SearchModel.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        SearchModelRealmProxyInterface realmObjectSource = (SearchModelRealmProxyInterface) newObject;
        SearchModelRealmProxyInterface realmObjectCopy = (SearchModelRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$uptime(realmObjectSource.realmGet$uptime());

        RealmList<com.imooc.viewpagertest.module.search.ProductModel> listList = realmObjectSource.realmGet$list();
        if (listList != null) {
            RealmList<com.imooc.viewpagertest.module.search.ProductModel> listRealmList = realmObjectCopy.realmGet$list();
            listRealmList.clear();
            for (int i = 0; i < listList.size(); i++) {
                com.imooc.viewpagertest.module.search.ProductModel listItem = listList.get(i);
                com.imooc.viewpagertest.module.search.ProductModel cachelist = (com.imooc.viewpagertest.module.search.ProductModel) cache.get(listItem);
                if (cachelist != null) {
                    listRealmList.add(cachelist);
                } else {
                    listRealmList.add(ProductModelRealmProxy.copyOrUpdate(realm, listItem, update, cache));
                }
            }
        }

        return realmObject;
    }

    public static long insert(Realm realm, com.imooc.viewpagertest.module.search.SearchModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.imooc.viewpagertest.module.search.SearchModel.class);
        long tableNativePtr = table.getNativePtr();
        SearchModelColumnInfo columnInfo = (SearchModelColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.SearchModel.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.uptimeIndex, rowIndex, ((SearchModelRealmProxyInterface) object).realmGet$uptime(), false);

        RealmList<com.imooc.viewpagertest.module.search.ProductModel> listList = ((SearchModelRealmProxyInterface) object).realmGet$list();
        if (listList != null) {
            OsList listOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.listIndex);
            for (com.imooc.viewpagertest.module.search.ProductModel listItem : listList) {
                Long cacheItemIndexlist = cache.get(listItem);
                if (cacheItemIndexlist == null) {
                    cacheItemIndexlist = ProductModelRealmProxy.insert(realm, listItem, cache);
                }
                listOsList.addRow(cacheItemIndexlist);
            }
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.imooc.viewpagertest.module.search.SearchModel.class);
        long tableNativePtr = table.getNativePtr();
        SearchModelColumnInfo columnInfo = (SearchModelColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.SearchModel.class);
        com.imooc.viewpagertest.module.search.SearchModel object = null;
        while (objects.hasNext()) {
            object = (com.imooc.viewpagertest.module.search.SearchModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.uptimeIndex, rowIndex, ((SearchModelRealmProxyInterface) object).realmGet$uptime(), false);

            RealmList<com.imooc.viewpagertest.module.search.ProductModel> listList = ((SearchModelRealmProxyInterface) object).realmGet$list();
            if (listList != null) {
                OsList listOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.listIndex);
                for (com.imooc.viewpagertest.module.search.ProductModel listItem : listList) {
                    Long cacheItemIndexlist = cache.get(listItem);
                    if (cacheItemIndexlist == null) {
                        cacheItemIndexlist = ProductModelRealmProxy.insert(realm, listItem, cache);
                    }
                    listOsList.addRow(cacheItemIndexlist);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.imooc.viewpagertest.module.search.SearchModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.imooc.viewpagertest.module.search.SearchModel.class);
        long tableNativePtr = table.getNativePtr();
        SearchModelColumnInfo columnInfo = (SearchModelColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.SearchModel.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.uptimeIndex, rowIndex, ((SearchModelRealmProxyInterface) object).realmGet$uptime(), false);

        OsList listOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.listIndex);
        RealmList<com.imooc.viewpagertest.module.search.ProductModel> listList = ((SearchModelRealmProxyInterface) object).realmGet$list();
        if (listList != null && listList.size() == listOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = listList.size();
            for (int i = 0; i < objects; i++) {
                com.imooc.viewpagertest.module.search.ProductModel listItem = listList.get(i);
                Long cacheItemIndexlist = cache.get(listItem);
                if (cacheItemIndexlist == null) {
                    cacheItemIndexlist = ProductModelRealmProxy.insertOrUpdate(realm, listItem, cache);
                }
                listOsList.setRow(i, cacheItemIndexlist);
            }
        } else {
            listOsList.removeAll();
            if (listList != null) {
                for (com.imooc.viewpagertest.module.search.ProductModel listItem : listList) {
                    Long cacheItemIndexlist = cache.get(listItem);
                    if (cacheItemIndexlist == null) {
                        cacheItemIndexlist = ProductModelRealmProxy.insertOrUpdate(realm, listItem, cache);
                    }
                    listOsList.addRow(cacheItemIndexlist);
                }
            }
        }

        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.imooc.viewpagertest.module.search.SearchModel.class);
        long tableNativePtr = table.getNativePtr();
        SearchModelColumnInfo columnInfo = (SearchModelColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.SearchModel.class);
        com.imooc.viewpagertest.module.search.SearchModel object = null;
        while (objects.hasNext()) {
            object = (com.imooc.viewpagertest.module.search.SearchModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.uptimeIndex, rowIndex, ((SearchModelRealmProxyInterface) object).realmGet$uptime(), false);

            OsList listOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.listIndex);
            RealmList<com.imooc.viewpagertest.module.search.ProductModel> listList = ((SearchModelRealmProxyInterface) object).realmGet$list();
            if (listList != null && listList.size() == listOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = listList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.imooc.viewpagertest.module.search.ProductModel listItem = listList.get(i);
                    Long cacheItemIndexlist = cache.get(listItem);
                    if (cacheItemIndexlist == null) {
                        cacheItemIndexlist = ProductModelRealmProxy.insertOrUpdate(realm, listItem, cache);
                    }
                    listOsList.setRow(i, cacheItemIndexlist);
                }
            } else {
                listOsList.removeAll();
                if (listList != null) {
                    for (com.imooc.viewpagertest.module.search.ProductModel listItem : listList) {
                        Long cacheItemIndexlist = cache.get(listItem);
                        if (cacheItemIndexlist == null) {
                            cacheItemIndexlist = ProductModelRealmProxy.insertOrUpdate(realm, listItem, cache);
                        }
                        listOsList.addRow(cacheItemIndexlist);
                    }
                }
            }

        }
    }

    public static com.imooc.viewpagertest.module.search.SearchModel createDetachedCopy(com.imooc.viewpagertest.module.search.SearchModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.imooc.viewpagertest.module.search.SearchModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.imooc.viewpagertest.module.search.SearchModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.imooc.viewpagertest.module.search.SearchModel) cachedObject.object;
            }
            unmanagedObject = (com.imooc.viewpagertest.module.search.SearchModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        SearchModelRealmProxyInterface unmanagedCopy = (SearchModelRealmProxyInterface) unmanagedObject;
        SearchModelRealmProxyInterface realmSource = (SearchModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$uptime(realmSource.realmGet$uptime());

        // Deep copy of list
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$list(null);
        } else {
            RealmList<com.imooc.viewpagertest.module.search.ProductModel> managedlistList = realmSource.realmGet$list();
            RealmList<com.imooc.viewpagertest.module.search.ProductModel> unmanagedlistList = new RealmList<com.imooc.viewpagertest.module.search.ProductModel>();
            unmanagedCopy.realmSet$list(unmanagedlistList);
            int nextDepth = currentDepth + 1;
            int size = managedlistList.size();
            for (int i = 0; i < size; i++) {
                com.imooc.viewpagertest.module.search.ProductModel item = ProductModelRealmProxy.createDetachedCopy(managedlistList.get(i), nextDepth, maxDepth, cache);
                unmanagedlistList.add(item);
            }
        }

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("SearchModel = proxy[");
        stringBuilder.append("{uptime:");
        stringBuilder.append(realmGet$uptime());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{list:");
        stringBuilder.append("RealmList<ProductModel>[").append(realmGet$list().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchModelRealmProxy aSearchModel = (SearchModelRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aSearchModel.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aSearchModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aSearchModel.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
