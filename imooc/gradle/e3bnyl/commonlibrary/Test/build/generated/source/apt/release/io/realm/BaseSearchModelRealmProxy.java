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
public class BaseSearchModelRealmProxy extends com.imooc.viewpagertest.module.search.BaseSearchModel
    implements RealmObjectProxy, BaseSearchModelRealmProxyInterface {

    static final class BaseSearchModelColumnInfo extends ColumnInfo {
        long ecodeIndex;
        long emsgIndex;
        long dataIndex;

        BaseSearchModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("BaseSearchModel");
            this.ecodeIndex = addColumnDetails("ecode", objectSchemaInfo);
            this.emsgIndex = addColumnDetails("emsg", objectSchemaInfo);
            this.dataIndex = addColumnDetails("data", objectSchemaInfo);
        }

        BaseSearchModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new BaseSearchModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final BaseSearchModelColumnInfo src = (BaseSearchModelColumnInfo) rawSrc;
            final BaseSearchModelColumnInfo dst = (BaseSearchModelColumnInfo) rawDst;
            dst.ecodeIndex = src.ecodeIndex;
            dst.emsgIndex = src.emsgIndex;
            dst.dataIndex = src.dataIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>(3);
        fieldNames.add("ecode");
        fieldNames.add("emsg");
        fieldNames.add("data");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    private BaseSearchModelColumnInfo columnInfo;
    private ProxyState<com.imooc.viewpagertest.module.search.BaseSearchModel> proxyState;

    BaseSearchModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (BaseSearchModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.imooc.viewpagertest.module.search.BaseSearchModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$ecode() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.ecodeIndex);
    }

    @Override
    public void realmSet$ecode(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.ecodeIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.ecodeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.ecodeIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.ecodeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$emsg() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.emsgIndex);
    }

    @Override
    public void realmSet$emsg(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.emsgIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.emsgIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.emsgIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.emsgIndex, value);
    }

    @Override
    public com.imooc.viewpagertest.module.search.SearchModel realmGet$data() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.dataIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.imooc.viewpagertest.module.search.SearchModel.class, proxyState.getRow$realm().getLink(columnInfo.dataIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$data(com.imooc.viewpagertest.module.search.SearchModel value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("data")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.dataIndex);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.dataIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.dataIndex);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.dataIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("BaseSearchModel", 3, 0);
        builder.addPersistedProperty("ecode", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("emsg", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("data", RealmFieldType.OBJECT, "SearchModel");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static BaseSearchModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new BaseSearchModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "BaseSearchModel";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.imooc.viewpagertest.module.search.BaseSearchModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        if (json.has("data")) {
            excludeFields.add("data");
        }
        com.imooc.viewpagertest.module.search.BaseSearchModel obj = realm.createObjectInternal(com.imooc.viewpagertest.module.search.BaseSearchModel.class, true, excludeFields);

        final BaseSearchModelRealmProxyInterface objProxy = (BaseSearchModelRealmProxyInterface) obj;
        if (json.has("ecode")) {
            if (json.isNull("ecode")) {
                objProxy.realmSet$ecode(null);
            } else {
                objProxy.realmSet$ecode((String) json.getString("ecode"));
            }
        }
        if (json.has("emsg")) {
            if (json.isNull("emsg")) {
                objProxy.realmSet$emsg(null);
            } else {
                objProxy.realmSet$emsg((String) json.getString("emsg"));
            }
        }
        if (json.has("data")) {
            if (json.isNull("data")) {
                objProxy.realmSet$data(null);
            } else {
                com.imooc.viewpagertest.module.search.SearchModel dataObj = SearchModelRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("data"), update);
                objProxy.realmSet$data(dataObj);
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.imooc.viewpagertest.module.search.BaseSearchModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.imooc.viewpagertest.module.search.BaseSearchModel obj = new com.imooc.viewpagertest.module.search.BaseSearchModel();
        final BaseSearchModelRealmProxyInterface objProxy = (BaseSearchModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("ecode")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$ecode((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$ecode(null);
                }
            } else if (name.equals("emsg")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$emsg((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$emsg(null);
                }
            } else if (name.equals("data")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$data(null);
                } else {
                    com.imooc.viewpagertest.module.search.SearchModel dataObj = SearchModelRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$data(dataObj);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    public static com.imooc.viewpagertest.module.search.BaseSearchModel copyOrUpdate(Realm realm, com.imooc.viewpagertest.module.search.BaseSearchModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.imooc.viewpagertest.module.search.BaseSearchModel) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static com.imooc.viewpagertest.module.search.BaseSearchModel copy(Realm realm, com.imooc.viewpagertest.module.search.BaseSearchModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.imooc.viewpagertest.module.search.BaseSearchModel) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.imooc.viewpagertest.module.search.BaseSearchModel realmObject = realm.createObjectInternal(com.imooc.viewpagertest.module.search.BaseSearchModel.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        BaseSearchModelRealmProxyInterface realmObjectSource = (BaseSearchModelRealmProxyInterface) newObject;
        BaseSearchModelRealmProxyInterface realmObjectCopy = (BaseSearchModelRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$ecode(realmObjectSource.realmGet$ecode());
        realmObjectCopy.realmSet$emsg(realmObjectSource.realmGet$emsg());

        com.imooc.viewpagertest.module.search.SearchModel dataObj = realmObjectSource.realmGet$data();
        if (dataObj == null) {
            realmObjectCopy.realmSet$data(null);
        } else {
            com.imooc.viewpagertest.module.search.SearchModel cachedata = (com.imooc.viewpagertest.module.search.SearchModel) cache.get(dataObj);
            if (cachedata != null) {
                realmObjectCopy.realmSet$data(cachedata);
            } else {
                realmObjectCopy.realmSet$data(SearchModelRealmProxy.copyOrUpdate(realm, dataObj, update, cache));
            }
        }
        return realmObject;
    }

    public static long insert(Realm realm, com.imooc.viewpagertest.module.search.BaseSearchModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.imooc.viewpagertest.module.search.BaseSearchModel.class);
        long tableNativePtr = table.getNativePtr();
        BaseSearchModelColumnInfo columnInfo = (BaseSearchModelColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.BaseSearchModel.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$ecode = ((BaseSearchModelRealmProxyInterface) object).realmGet$ecode();
        if (realmGet$ecode != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.ecodeIndex, rowIndex, realmGet$ecode, false);
        }
        String realmGet$emsg = ((BaseSearchModelRealmProxyInterface) object).realmGet$emsg();
        if (realmGet$emsg != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emsgIndex, rowIndex, realmGet$emsg, false);
        }

        com.imooc.viewpagertest.module.search.SearchModel dataObj = ((BaseSearchModelRealmProxyInterface) object).realmGet$data();
        if (dataObj != null) {
            Long cachedata = cache.get(dataObj);
            if (cachedata == null) {
                cachedata = SearchModelRealmProxy.insert(realm, dataObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.dataIndex, rowIndex, cachedata, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.imooc.viewpagertest.module.search.BaseSearchModel.class);
        long tableNativePtr = table.getNativePtr();
        BaseSearchModelColumnInfo columnInfo = (BaseSearchModelColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.BaseSearchModel.class);
        com.imooc.viewpagertest.module.search.BaseSearchModel object = null;
        while (objects.hasNext()) {
            object = (com.imooc.viewpagertest.module.search.BaseSearchModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$ecode = ((BaseSearchModelRealmProxyInterface) object).realmGet$ecode();
            if (realmGet$ecode != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.ecodeIndex, rowIndex, realmGet$ecode, false);
            }
            String realmGet$emsg = ((BaseSearchModelRealmProxyInterface) object).realmGet$emsg();
            if (realmGet$emsg != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emsgIndex, rowIndex, realmGet$emsg, false);
            }

            com.imooc.viewpagertest.module.search.SearchModel dataObj = ((BaseSearchModelRealmProxyInterface) object).realmGet$data();
            if (dataObj != null) {
                Long cachedata = cache.get(dataObj);
                if (cachedata == null) {
                    cachedata = SearchModelRealmProxy.insert(realm, dataObj, cache);
                }
                table.setLink(columnInfo.dataIndex, rowIndex, cachedata, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.imooc.viewpagertest.module.search.BaseSearchModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.imooc.viewpagertest.module.search.BaseSearchModel.class);
        long tableNativePtr = table.getNativePtr();
        BaseSearchModelColumnInfo columnInfo = (BaseSearchModelColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.BaseSearchModel.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$ecode = ((BaseSearchModelRealmProxyInterface) object).realmGet$ecode();
        if (realmGet$ecode != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.ecodeIndex, rowIndex, realmGet$ecode, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.ecodeIndex, rowIndex, false);
        }
        String realmGet$emsg = ((BaseSearchModelRealmProxyInterface) object).realmGet$emsg();
        if (realmGet$emsg != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emsgIndex, rowIndex, realmGet$emsg, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.emsgIndex, rowIndex, false);
        }

        com.imooc.viewpagertest.module.search.SearchModel dataObj = ((BaseSearchModelRealmProxyInterface) object).realmGet$data();
        if (dataObj != null) {
            Long cachedata = cache.get(dataObj);
            if (cachedata == null) {
                cachedata = SearchModelRealmProxy.insertOrUpdate(realm, dataObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.dataIndex, rowIndex, cachedata, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.dataIndex, rowIndex);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.imooc.viewpagertest.module.search.BaseSearchModel.class);
        long tableNativePtr = table.getNativePtr();
        BaseSearchModelColumnInfo columnInfo = (BaseSearchModelColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.BaseSearchModel.class);
        com.imooc.viewpagertest.module.search.BaseSearchModel object = null;
        while (objects.hasNext()) {
            object = (com.imooc.viewpagertest.module.search.BaseSearchModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$ecode = ((BaseSearchModelRealmProxyInterface) object).realmGet$ecode();
            if (realmGet$ecode != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.ecodeIndex, rowIndex, realmGet$ecode, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.ecodeIndex, rowIndex, false);
            }
            String realmGet$emsg = ((BaseSearchModelRealmProxyInterface) object).realmGet$emsg();
            if (realmGet$emsg != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emsgIndex, rowIndex, realmGet$emsg, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.emsgIndex, rowIndex, false);
            }

            com.imooc.viewpagertest.module.search.SearchModel dataObj = ((BaseSearchModelRealmProxyInterface) object).realmGet$data();
            if (dataObj != null) {
                Long cachedata = cache.get(dataObj);
                if (cachedata == null) {
                    cachedata = SearchModelRealmProxy.insertOrUpdate(realm, dataObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.dataIndex, rowIndex, cachedata, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.dataIndex, rowIndex);
            }
        }
    }

    public static com.imooc.viewpagertest.module.search.BaseSearchModel createDetachedCopy(com.imooc.viewpagertest.module.search.BaseSearchModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.imooc.viewpagertest.module.search.BaseSearchModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.imooc.viewpagertest.module.search.BaseSearchModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.imooc.viewpagertest.module.search.BaseSearchModel) cachedObject.object;
            }
            unmanagedObject = (com.imooc.viewpagertest.module.search.BaseSearchModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        BaseSearchModelRealmProxyInterface unmanagedCopy = (BaseSearchModelRealmProxyInterface) unmanagedObject;
        BaseSearchModelRealmProxyInterface realmSource = (BaseSearchModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$ecode(realmSource.realmGet$ecode());
        unmanagedCopy.realmSet$emsg(realmSource.realmGet$emsg());

        // Deep copy of data
        unmanagedCopy.realmSet$data(SearchModelRealmProxy.createDetachedCopy(realmSource.realmGet$data(), currentDepth + 1, maxDepth, cache));

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("BaseSearchModel = proxy[");
        stringBuilder.append("{ecode:");
        stringBuilder.append(realmGet$ecode() != null ? realmGet$ecode() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{emsg:");
        stringBuilder.append(realmGet$emsg() != null ? realmGet$emsg() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{data:");
        stringBuilder.append(realmGet$data() != null ? "SearchModel" : "null");
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
        BaseSearchModelRealmProxy aBaseSearchModel = (BaseSearchModelRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aBaseSearchModel.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aBaseSearchModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aBaseSearchModel.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
