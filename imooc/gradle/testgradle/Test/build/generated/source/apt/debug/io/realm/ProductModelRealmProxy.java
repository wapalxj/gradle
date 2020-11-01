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
public class ProductModelRealmProxy extends com.imooc.viewpagertest.module.search.ProductModel
    implements RealmObjectProxy, ProductModelRealmProxyInterface {

    static final class ProductModelColumnInfo extends ColumnInfo {
        long _idIndex;
        long fdcodeIndex;
        long abbrevIndex;
        long spellIndex;
        long typeIndex;
        long timeIndex;

        ProductModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("ProductModel");
            this._idIndex = addColumnDetails("_id", objectSchemaInfo);
            this.fdcodeIndex = addColumnDetails("fdcode", objectSchemaInfo);
            this.abbrevIndex = addColumnDetails("abbrev", objectSchemaInfo);
            this.spellIndex = addColumnDetails("spell", objectSchemaInfo);
            this.typeIndex = addColumnDetails("type", objectSchemaInfo);
            this.timeIndex = addColumnDetails("time", objectSchemaInfo);
        }

        ProductModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ProductModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ProductModelColumnInfo src = (ProductModelColumnInfo) rawSrc;
            final ProductModelColumnInfo dst = (ProductModelColumnInfo) rawDst;
            dst._idIndex = src._idIndex;
            dst.fdcodeIndex = src.fdcodeIndex;
            dst.abbrevIndex = src.abbrevIndex;
            dst.spellIndex = src.spellIndex;
            dst.typeIndex = src.typeIndex;
            dst.timeIndex = src.timeIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>(6);
        fieldNames.add("_id");
        fieldNames.add("fdcode");
        fieldNames.add("abbrev");
        fieldNames.add("spell");
        fieldNames.add("type");
        fieldNames.add("time");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    private ProductModelColumnInfo columnInfo;
    private ProxyState<com.imooc.viewpagertest.module.search.ProductModel> proxyState;

    ProductModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ProductModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.imooc.viewpagertest.module.search.ProductModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$_id() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo._idIndex);
    }

    @Override
    public void realmSet$_id(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo._idIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo._idIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo._idIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo._idIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$fdcode() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.fdcodeIndex);
    }

    @Override
    public void realmSet$fdcode(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.fdcodeIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.fdcodeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.fdcodeIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.fdcodeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$abbrev() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.abbrevIndex);
    }

    @Override
    public void realmSet$abbrev(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.abbrevIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.abbrevIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.abbrevIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.abbrevIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$spell() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.spellIndex);
    }

    @Override
    public void realmSet$spell(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.spellIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.spellIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.spellIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.spellIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$type() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.typeIndex);
    }

    @Override
    public void realmSet$type(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.typeIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.typeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.typeIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.typeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$time() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.timeIndex);
    }

    @Override
    public void realmSet$time(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.timeIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.timeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.timeIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.timeIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("ProductModel", 6, 0);
        builder.addPersistedProperty("_id", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("fdcode", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("abbrev", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("spell", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("type", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("time", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ProductModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ProductModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "ProductModel";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.imooc.viewpagertest.module.search.ProductModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.imooc.viewpagertest.module.search.ProductModel obj = realm.createObjectInternal(com.imooc.viewpagertest.module.search.ProductModel.class, true, excludeFields);

        final ProductModelRealmProxyInterface objProxy = (ProductModelRealmProxyInterface) obj;
        if (json.has("_id")) {
            if (json.isNull("_id")) {
                objProxy.realmSet$_id(null);
            } else {
                objProxy.realmSet$_id((String) json.getString("_id"));
            }
        }
        if (json.has("fdcode")) {
            if (json.isNull("fdcode")) {
                objProxy.realmSet$fdcode(null);
            } else {
                objProxy.realmSet$fdcode((String) json.getString("fdcode"));
            }
        }
        if (json.has("abbrev")) {
            if (json.isNull("abbrev")) {
                objProxy.realmSet$abbrev(null);
            } else {
                objProxy.realmSet$abbrev((String) json.getString("abbrev"));
            }
        }
        if (json.has("spell")) {
            if (json.isNull("spell")) {
                objProxy.realmSet$spell(null);
            } else {
                objProxy.realmSet$spell((String) json.getString("spell"));
            }
        }
        if (json.has("type")) {
            if (json.isNull("type")) {
                objProxy.realmSet$type(null);
            } else {
                objProxy.realmSet$type((String) json.getString("type"));
            }
        }
        if (json.has("time")) {
            if (json.isNull("time")) {
                objProxy.realmSet$time(null);
            } else {
                objProxy.realmSet$time((String) json.getString("time"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.imooc.viewpagertest.module.search.ProductModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.imooc.viewpagertest.module.search.ProductModel obj = new com.imooc.viewpagertest.module.search.ProductModel();
        final ProductModelRealmProxyInterface objProxy = (ProductModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("_id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$_id((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$_id(null);
                }
            } else if (name.equals("fdcode")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$fdcode((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$fdcode(null);
                }
            } else if (name.equals("abbrev")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$abbrev((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$abbrev(null);
                }
            } else if (name.equals("spell")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$spell((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$spell(null);
                }
            } else if (name.equals("type")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$type((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$type(null);
                }
            } else if (name.equals("time")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$time((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$time(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    public static com.imooc.viewpagertest.module.search.ProductModel copyOrUpdate(Realm realm, com.imooc.viewpagertest.module.search.ProductModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.imooc.viewpagertest.module.search.ProductModel) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static com.imooc.viewpagertest.module.search.ProductModel copy(Realm realm, com.imooc.viewpagertest.module.search.ProductModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.imooc.viewpagertest.module.search.ProductModel) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.imooc.viewpagertest.module.search.ProductModel realmObject = realm.createObjectInternal(com.imooc.viewpagertest.module.search.ProductModel.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        ProductModelRealmProxyInterface realmObjectSource = (ProductModelRealmProxyInterface) newObject;
        ProductModelRealmProxyInterface realmObjectCopy = (ProductModelRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$_id(realmObjectSource.realmGet$_id());
        realmObjectCopy.realmSet$fdcode(realmObjectSource.realmGet$fdcode());
        realmObjectCopy.realmSet$abbrev(realmObjectSource.realmGet$abbrev());
        realmObjectCopy.realmSet$spell(realmObjectSource.realmGet$spell());
        realmObjectCopy.realmSet$type(realmObjectSource.realmGet$type());
        realmObjectCopy.realmSet$time(realmObjectSource.realmGet$time());
        return realmObject;
    }

    public static long insert(Realm realm, com.imooc.viewpagertest.module.search.ProductModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.imooc.viewpagertest.module.search.ProductModel.class);
        long tableNativePtr = table.getNativePtr();
        ProductModelColumnInfo columnInfo = (ProductModelColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.ProductModel.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$_id = ((ProductModelRealmProxyInterface) object).realmGet$_id();
        if (realmGet$_id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo._idIndex, rowIndex, realmGet$_id, false);
        }
        String realmGet$fdcode = ((ProductModelRealmProxyInterface) object).realmGet$fdcode();
        if (realmGet$fdcode != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fdcodeIndex, rowIndex, realmGet$fdcode, false);
        }
        String realmGet$abbrev = ((ProductModelRealmProxyInterface) object).realmGet$abbrev();
        if (realmGet$abbrev != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.abbrevIndex, rowIndex, realmGet$abbrev, false);
        }
        String realmGet$spell = ((ProductModelRealmProxyInterface) object).realmGet$spell();
        if (realmGet$spell != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.spellIndex, rowIndex, realmGet$spell, false);
        }
        String realmGet$type = ((ProductModelRealmProxyInterface) object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
        }
        String realmGet$time = ((ProductModelRealmProxyInterface) object).realmGet$time();
        if (realmGet$time != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.timeIndex, rowIndex, realmGet$time, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.imooc.viewpagertest.module.search.ProductModel.class);
        long tableNativePtr = table.getNativePtr();
        ProductModelColumnInfo columnInfo = (ProductModelColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.ProductModel.class);
        com.imooc.viewpagertest.module.search.ProductModel object = null;
        while (objects.hasNext()) {
            object = (com.imooc.viewpagertest.module.search.ProductModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$_id = ((ProductModelRealmProxyInterface) object).realmGet$_id();
            if (realmGet$_id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo._idIndex, rowIndex, realmGet$_id, false);
            }
            String realmGet$fdcode = ((ProductModelRealmProxyInterface) object).realmGet$fdcode();
            if (realmGet$fdcode != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fdcodeIndex, rowIndex, realmGet$fdcode, false);
            }
            String realmGet$abbrev = ((ProductModelRealmProxyInterface) object).realmGet$abbrev();
            if (realmGet$abbrev != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.abbrevIndex, rowIndex, realmGet$abbrev, false);
            }
            String realmGet$spell = ((ProductModelRealmProxyInterface) object).realmGet$spell();
            if (realmGet$spell != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.spellIndex, rowIndex, realmGet$spell, false);
            }
            String realmGet$type = ((ProductModelRealmProxyInterface) object).realmGet$type();
            if (realmGet$type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
            }
            String realmGet$time = ((ProductModelRealmProxyInterface) object).realmGet$time();
            if (realmGet$time != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.timeIndex, rowIndex, realmGet$time, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.imooc.viewpagertest.module.search.ProductModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.imooc.viewpagertest.module.search.ProductModel.class);
        long tableNativePtr = table.getNativePtr();
        ProductModelColumnInfo columnInfo = (ProductModelColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.ProductModel.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$_id = ((ProductModelRealmProxyInterface) object).realmGet$_id();
        if (realmGet$_id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo._idIndex, rowIndex, realmGet$_id, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo._idIndex, rowIndex, false);
        }
        String realmGet$fdcode = ((ProductModelRealmProxyInterface) object).realmGet$fdcode();
        if (realmGet$fdcode != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fdcodeIndex, rowIndex, realmGet$fdcode, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.fdcodeIndex, rowIndex, false);
        }
        String realmGet$abbrev = ((ProductModelRealmProxyInterface) object).realmGet$abbrev();
        if (realmGet$abbrev != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.abbrevIndex, rowIndex, realmGet$abbrev, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.abbrevIndex, rowIndex, false);
        }
        String realmGet$spell = ((ProductModelRealmProxyInterface) object).realmGet$spell();
        if (realmGet$spell != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.spellIndex, rowIndex, realmGet$spell, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.spellIndex, rowIndex, false);
        }
        String realmGet$type = ((ProductModelRealmProxyInterface) object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.typeIndex, rowIndex, false);
        }
        String realmGet$time = ((ProductModelRealmProxyInterface) object).realmGet$time();
        if (realmGet$time != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.timeIndex, rowIndex, realmGet$time, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.timeIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.imooc.viewpagertest.module.search.ProductModel.class);
        long tableNativePtr = table.getNativePtr();
        ProductModelColumnInfo columnInfo = (ProductModelColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.search.ProductModel.class);
        com.imooc.viewpagertest.module.search.ProductModel object = null;
        while (objects.hasNext()) {
            object = (com.imooc.viewpagertest.module.search.ProductModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$_id = ((ProductModelRealmProxyInterface) object).realmGet$_id();
            if (realmGet$_id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo._idIndex, rowIndex, realmGet$_id, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo._idIndex, rowIndex, false);
            }
            String realmGet$fdcode = ((ProductModelRealmProxyInterface) object).realmGet$fdcode();
            if (realmGet$fdcode != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fdcodeIndex, rowIndex, realmGet$fdcode, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.fdcodeIndex, rowIndex, false);
            }
            String realmGet$abbrev = ((ProductModelRealmProxyInterface) object).realmGet$abbrev();
            if (realmGet$abbrev != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.abbrevIndex, rowIndex, realmGet$abbrev, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.abbrevIndex, rowIndex, false);
            }
            String realmGet$spell = ((ProductModelRealmProxyInterface) object).realmGet$spell();
            if (realmGet$spell != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.spellIndex, rowIndex, realmGet$spell, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.spellIndex, rowIndex, false);
            }
            String realmGet$type = ((ProductModelRealmProxyInterface) object).realmGet$type();
            if (realmGet$type != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.typeIndex, rowIndex, false);
            }
            String realmGet$time = ((ProductModelRealmProxyInterface) object).realmGet$time();
            if (realmGet$time != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.timeIndex, rowIndex, realmGet$time, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.timeIndex, rowIndex, false);
            }
        }
    }

    public static com.imooc.viewpagertest.module.search.ProductModel createDetachedCopy(com.imooc.viewpagertest.module.search.ProductModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.imooc.viewpagertest.module.search.ProductModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.imooc.viewpagertest.module.search.ProductModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.imooc.viewpagertest.module.search.ProductModel) cachedObject.object;
            }
            unmanagedObject = (com.imooc.viewpagertest.module.search.ProductModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        ProductModelRealmProxyInterface unmanagedCopy = (ProductModelRealmProxyInterface) unmanagedObject;
        ProductModelRealmProxyInterface realmSource = (ProductModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$_id(realmSource.realmGet$_id());
        unmanagedCopy.realmSet$fdcode(realmSource.realmGet$fdcode());
        unmanagedCopy.realmSet$abbrev(realmSource.realmGet$abbrev());
        unmanagedCopy.realmSet$spell(realmSource.realmGet$spell());
        unmanagedCopy.realmSet$type(realmSource.realmGet$type());
        unmanagedCopy.realmSet$time(realmSource.realmGet$time());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("ProductModel = proxy[");
        stringBuilder.append("{_id:");
        stringBuilder.append(realmGet$_id() != null ? realmGet$_id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{fdcode:");
        stringBuilder.append(realmGet$fdcode() != null ? realmGet$fdcode() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{abbrev:");
        stringBuilder.append(realmGet$abbrev() != null ? realmGet$abbrev() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{spell:");
        stringBuilder.append(realmGet$spell() != null ? realmGet$spell() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{type:");
        stringBuilder.append(realmGet$type() != null ? realmGet$type() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{time:");
        stringBuilder.append(realmGet$time() != null ? realmGet$time() : "null");
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
        ProductModelRealmProxy aProductModel = (ProductModelRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aProductModel.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aProductModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aProductModel.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
