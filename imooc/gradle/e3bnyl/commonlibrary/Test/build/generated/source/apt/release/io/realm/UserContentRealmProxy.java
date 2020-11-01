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
public class UserContentRealmProxy extends com.imooc.viewpagertest.module.realm.UserContent
    implements RealmObjectProxy, UserContentRealmProxyInterface {

    static final class UserContentColumnInfo extends ColumnInfo {
        long userIdIndex;
        long photoUrlIndex;
        long nameIndex;
        long tickIndex;
        long mobileIndex;
        long passwdIndex;
        long emailIndex;
        long parentIndex;
        long sexIndex;

        UserContentColumnInfo(OsSchemaInfo schemaInfo) {
            super(9);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("UserContent");
            this.userIdIndex = addColumnDetails("userId", objectSchemaInfo);
            this.photoUrlIndex = addColumnDetails("photoUrl", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", objectSchemaInfo);
            this.tickIndex = addColumnDetails("tick", objectSchemaInfo);
            this.mobileIndex = addColumnDetails("mobile", objectSchemaInfo);
            this.passwdIndex = addColumnDetails("passwd", objectSchemaInfo);
            this.emailIndex = addColumnDetails("email", objectSchemaInfo);
            this.parentIndex = addColumnDetails("parent", objectSchemaInfo);
            this.sexIndex = addColumnDetails("sex", objectSchemaInfo);
        }

        UserContentColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new UserContentColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final UserContentColumnInfo src = (UserContentColumnInfo) rawSrc;
            final UserContentColumnInfo dst = (UserContentColumnInfo) rawDst;
            dst.userIdIndex = src.userIdIndex;
            dst.photoUrlIndex = src.photoUrlIndex;
            dst.nameIndex = src.nameIndex;
            dst.tickIndex = src.tickIndex;
            dst.mobileIndex = src.mobileIndex;
            dst.passwdIndex = src.passwdIndex;
            dst.emailIndex = src.emailIndex;
            dst.parentIndex = src.parentIndex;
            dst.sexIndex = src.sexIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>(9);
        fieldNames.add("userId");
        fieldNames.add("photoUrl");
        fieldNames.add("name");
        fieldNames.add("tick");
        fieldNames.add("mobile");
        fieldNames.add("passwd");
        fieldNames.add("email");
        fieldNames.add("parent");
        fieldNames.add("sex");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    private UserContentColumnInfo columnInfo;
    private ProxyState<com.imooc.viewpagertest.module.realm.UserContent> proxyState;

    UserContentRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (UserContentColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.imooc.viewpagertest.module.realm.UserContent>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$userId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.userIdIndex);
    }

    @Override
    public void realmSet$userId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.userIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.userIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.userIdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.userIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$photoUrl() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.photoUrlIndex);
    }

    @Override
    public void realmSet$photoUrl(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.photoUrlIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.photoUrlIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.photoUrlIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.photoUrlIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameIndex);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$tick() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.tickIndex);
    }

    @Override
    public void realmSet$tick(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.tickIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.tickIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.tickIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.tickIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$mobile() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.mobileIndex);
    }

    @Override
    public void realmSet$mobile(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.mobileIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.mobileIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.mobileIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.mobileIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$passwd() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.passwdIndex);
    }

    @Override
    public void realmSet$passwd(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.passwdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.passwdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.passwdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.passwdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$email() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.emailIndex);
    }

    @Override
    public void realmSet$email(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.emailIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.emailIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.emailIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.emailIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$parent() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.parentIndex);
    }

    @Override
    public void realmSet$parent(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.parentIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.parentIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.parentIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.parentIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$sex() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.sexIndex);
    }

    @Override
    public void realmSet$sex(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.sexIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.sexIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("UserContent", 9, 0);
        builder.addPersistedProperty("userId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("photoUrl", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("tick", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("mobile", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("passwd", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("email", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("parent", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("sex", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static UserContentColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new UserContentColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "UserContent";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.imooc.viewpagertest.module.realm.UserContent createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.imooc.viewpagertest.module.realm.UserContent obj = realm.createObjectInternal(com.imooc.viewpagertest.module.realm.UserContent.class, true, excludeFields);

        final UserContentRealmProxyInterface objProxy = (UserContentRealmProxyInterface) obj;
        if (json.has("userId")) {
            if (json.isNull("userId")) {
                objProxy.realmSet$userId(null);
            } else {
                objProxy.realmSet$userId((String) json.getString("userId"));
            }
        }
        if (json.has("photoUrl")) {
            if (json.isNull("photoUrl")) {
                objProxy.realmSet$photoUrl(null);
            } else {
                objProxy.realmSet$photoUrl((String) json.getString("photoUrl"));
            }
        }
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("tick")) {
            if (json.isNull("tick")) {
                objProxy.realmSet$tick(null);
            } else {
                objProxy.realmSet$tick((String) json.getString("tick"));
            }
        }
        if (json.has("mobile")) {
            if (json.isNull("mobile")) {
                objProxy.realmSet$mobile(null);
            } else {
                objProxy.realmSet$mobile((String) json.getString("mobile"));
            }
        }
        if (json.has("passwd")) {
            if (json.isNull("passwd")) {
                objProxy.realmSet$passwd(null);
            } else {
                objProxy.realmSet$passwd((String) json.getString("passwd"));
            }
        }
        if (json.has("email")) {
            if (json.isNull("email")) {
                objProxy.realmSet$email(null);
            } else {
                objProxy.realmSet$email((String) json.getString("email"));
            }
        }
        if (json.has("parent")) {
            if (json.isNull("parent")) {
                objProxy.realmSet$parent(null);
            } else {
                objProxy.realmSet$parent((String) json.getString("parent"));
            }
        }
        if (json.has("sex")) {
            if (json.isNull("sex")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'sex' to null.");
            } else {
                objProxy.realmSet$sex((int) json.getInt("sex"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.imooc.viewpagertest.module.realm.UserContent createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.imooc.viewpagertest.module.realm.UserContent obj = new com.imooc.viewpagertest.module.realm.UserContent();
        final UserContentRealmProxyInterface objProxy = (UserContentRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("userId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$userId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$userId(null);
                }
            } else if (name.equals("photoUrl")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$photoUrl((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$photoUrl(null);
                }
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("tick")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$tick((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$tick(null);
                }
            } else if (name.equals("mobile")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$mobile((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$mobile(null);
                }
            } else if (name.equals("passwd")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$passwd((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$passwd(null);
                }
            } else if (name.equals("email")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$email((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$email(null);
                }
            } else if (name.equals("parent")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$parent((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$parent(null);
                }
            } else if (name.equals("sex")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$sex((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'sex' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    public static com.imooc.viewpagertest.module.realm.UserContent copyOrUpdate(Realm realm, com.imooc.viewpagertest.module.realm.UserContent object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.imooc.viewpagertest.module.realm.UserContent) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static com.imooc.viewpagertest.module.realm.UserContent copy(Realm realm, com.imooc.viewpagertest.module.realm.UserContent newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.imooc.viewpagertest.module.realm.UserContent) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.imooc.viewpagertest.module.realm.UserContent realmObject = realm.createObjectInternal(com.imooc.viewpagertest.module.realm.UserContent.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        UserContentRealmProxyInterface realmObjectSource = (UserContentRealmProxyInterface) newObject;
        UserContentRealmProxyInterface realmObjectCopy = (UserContentRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$userId(realmObjectSource.realmGet$userId());
        realmObjectCopy.realmSet$photoUrl(realmObjectSource.realmGet$photoUrl());
        realmObjectCopy.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectCopy.realmSet$tick(realmObjectSource.realmGet$tick());
        realmObjectCopy.realmSet$mobile(realmObjectSource.realmGet$mobile());
        realmObjectCopy.realmSet$passwd(realmObjectSource.realmGet$passwd());
        realmObjectCopy.realmSet$email(realmObjectSource.realmGet$email());
        realmObjectCopy.realmSet$parent(realmObjectSource.realmGet$parent());
        realmObjectCopy.realmSet$sex(realmObjectSource.realmGet$sex());
        return realmObject;
    }

    public static long insert(Realm realm, com.imooc.viewpagertest.module.realm.UserContent object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.imooc.viewpagertest.module.realm.UserContent.class);
        long tableNativePtr = table.getNativePtr();
        UserContentColumnInfo columnInfo = (UserContentColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.realm.UserContent.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$userId = ((UserContentRealmProxyInterface) object).realmGet$userId();
        if (realmGet$userId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId, false);
        }
        String realmGet$photoUrl = ((UserContentRealmProxyInterface) object).realmGet$photoUrl();
        if (realmGet$photoUrl != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photoUrlIndex, rowIndex, realmGet$photoUrl, false);
        }
        String realmGet$name = ((UserContentRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        String realmGet$tick = ((UserContentRealmProxyInterface) object).realmGet$tick();
        if (realmGet$tick != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tickIndex, rowIndex, realmGet$tick, false);
        }
        String realmGet$mobile = ((UserContentRealmProxyInterface) object).realmGet$mobile();
        if (realmGet$mobile != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.mobileIndex, rowIndex, realmGet$mobile, false);
        }
        String realmGet$passwd = ((UserContentRealmProxyInterface) object).realmGet$passwd();
        if (realmGet$passwd != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.passwdIndex, rowIndex, realmGet$passwd, false);
        }
        String realmGet$email = ((UserContentRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
        }
        String realmGet$parent = ((UserContentRealmProxyInterface) object).realmGet$parent();
        if (realmGet$parent != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.parentIndex, rowIndex, realmGet$parent, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.sexIndex, rowIndex, ((UserContentRealmProxyInterface) object).realmGet$sex(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.imooc.viewpagertest.module.realm.UserContent.class);
        long tableNativePtr = table.getNativePtr();
        UserContentColumnInfo columnInfo = (UserContentColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.realm.UserContent.class);
        com.imooc.viewpagertest.module.realm.UserContent object = null;
        while (objects.hasNext()) {
            object = (com.imooc.viewpagertest.module.realm.UserContent) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$userId = ((UserContentRealmProxyInterface) object).realmGet$userId();
            if (realmGet$userId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId, false);
            }
            String realmGet$photoUrl = ((UserContentRealmProxyInterface) object).realmGet$photoUrl();
            if (realmGet$photoUrl != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photoUrlIndex, rowIndex, realmGet$photoUrl, false);
            }
            String realmGet$name = ((UserContentRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
            String realmGet$tick = ((UserContentRealmProxyInterface) object).realmGet$tick();
            if (realmGet$tick != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tickIndex, rowIndex, realmGet$tick, false);
            }
            String realmGet$mobile = ((UserContentRealmProxyInterface) object).realmGet$mobile();
            if (realmGet$mobile != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.mobileIndex, rowIndex, realmGet$mobile, false);
            }
            String realmGet$passwd = ((UserContentRealmProxyInterface) object).realmGet$passwd();
            if (realmGet$passwd != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.passwdIndex, rowIndex, realmGet$passwd, false);
            }
            String realmGet$email = ((UserContentRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
            }
            String realmGet$parent = ((UserContentRealmProxyInterface) object).realmGet$parent();
            if (realmGet$parent != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.parentIndex, rowIndex, realmGet$parent, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.sexIndex, rowIndex, ((UserContentRealmProxyInterface) object).realmGet$sex(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.imooc.viewpagertest.module.realm.UserContent object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.imooc.viewpagertest.module.realm.UserContent.class);
        long tableNativePtr = table.getNativePtr();
        UserContentColumnInfo columnInfo = (UserContentColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.realm.UserContent.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$userId = ((UserContentRealmProxyInterface) object).realmGet$userId();
        if (realmGet$userId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userIdIndex, rowIndex, false);
        }
        String realmGet$photoUrl = ((UserContentRealmProxyInterface) object).realmGet$photoUrl();
        if (realmGet$photoUrl != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photoUrlIndex, rowIndex, realmGet$photoUrl, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.photoUrlIndex, rowIndex, false);
        }
        String realmGet$name = ((UserContentRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        String realmGet$tick = ((UserContentRealmProxyInterface) object).realmGet$tick();
        if (realmGet$tick != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.tickIndex, rowIndex, realmGet$tick, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.tickIndex, rowIndex, false);
        }
        String realmGet$mobile = ((UserContentRealmProxyInterface) object).realmGet$mobile();
        if (realmGet$mobile != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.mobileIndex, rowIndex, realmGet$mobile, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.mobileIndex, rowIndex, false);
        }
        String realmGet$passwd = ((UserContentRealmProxyInterface) object).realmGet$passwd();
        if (realmGet$passwd != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.passwdIndex, rowIndex, realmGet$passwd, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.passwdIndex, rowIndex, false);
        }
        String realmGet$email = ((UserContentRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.emailIndex, rowIndex, false);
        }
        String realmGet$parent = ((UserContentRealmProxyInterface) object).realmGet$parent();
        if (realmGet$parent != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.parentIndex, rowIndex, realmGet$parent, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.parentIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.sexIndex, rowIndex, ((UserContentRealmProxyInterface) object).realmGet$sex(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.imooc.viewpagertest.module.realm.UserContent.class);
        long tableNativePtr = table.getNativePtr();
        UserContentColumnInfo columnInfo = (UserContentColumnInfo) realm.getSchema().getColumnInfo(com.imooc.viewpagertest.module.realm.UserContent.class);
        com.imooc.viewpagertest.module.realm.UserContent object = null;
        while (objects.hasNext()) {
            object = (com.imooc.viewpagertest.module.realm.UserContent) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$userId = ((UserContentRealmProxyInterface) object).realmGet$userId();
            if (realmGet$userId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userIdIndex, rowIndex, false);
            }
            String realmGet$photoUrl = ((UserContentRealmProxyInterface) object).realmGet$photoUrl();
            if (realmGet$photoUrl != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photoUrlIndex, rowIndex, realmGet$photoUrl, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.photoUrlIndex, rowIndex, false);
            }
            String realmGet$name = ((UserContentRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
            String realmGet$tick = ((UserContentRealmProxyInterface) object).realmGet$tick();
            if (realmGet$tick != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.tickIndex, rowIndex, realmGet$tick, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.tickIndex, rowIndex, false);
            }
            String realmGet$mobile = ((UserContentRealmProxyInterface) object).realmGet$mobile();
            if (realmGet$mobile != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.mobileIndex, rowIndex, realmGet$mobile, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.mobileIndex, rowIndex, false);
            }
            String realmGet$passwd = ((UserContentRealmProxyInterface) object).realmGet$passwd();
            if (realmGet$passwd != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.passwdIndex, rowIndex, realmGet$passwd, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.passwdIndex, rowIndex, false);
            }
            String realmGet$email = ((UserContentRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.emailIndex, rowIndex, false);
            }
            String realmGet$parent = ((UserContentRealmProxyInterface) object).realmGet$parent();
            if (realmGet$parent != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.parentIndex, rowIndex, realmGet$parent, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.parentIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.sexIndex, rowIndex, ((UserContentRealmProxyInterface) object).realmGet$sex(), false);
        }
    }

    public static com.imooc.viewpagertest.module.realm.UserContent createDetachedCopy(com.imooc.viewpagertest.module.realm.UserContent realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.imooc.viewpagertest.module.realm.UserContent unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.imooc.viewpagertest.module.realm.UserContent();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.imooc.viewpagertest.module.realm.UserContent) cachedObject.object;
            }
            unmanagedObject = (com.imooc.viewpagertest.module.realm.UserContent) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        UserContentRealmProxyInterface unmanagedCopy = (UserContentRealmProxyInterface) unmanagedObject;
        UserContentRealmProxyInterface realmSource = (UserContentRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$userId(realmSource.realmGet$userId());
        unmanagedCopy.realmSet$photoUrl(realmSource.realmGet$photoUrl());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$tick(realmSource.realmGet$tick());
        unmanagedCopy.realmSet$mobile(realmSource.realmGet$mobile());
        unmanagedCopy.realmSet$passwd(realmSource.realmGet$passwd());
        unmanagedCopy.realmSet$email(realmSource.realmGet$email());
        unmanagedCopy.realmSet$parent(realmSource.realmGet$parent());
        unmanagedCopy.realmSet$sex(realmSource.realmGet$sex());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("UserContent = proxy[");
        stringBuilder.append("{userId:");
        stringBuilder.append(realmGet$userId() != null ? realmGet$userId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{photoUrl:");
        stringBuilder.append(realmGet$photoUrl() != null ? realmGet$photoUrl() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{tick:");
        stringBuilder.append(realmGet$tick() != null ? realmGet$tick() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{mobile:");
        stringBuilder.append(realmGet$mobile() != null ? realmGet$mobile() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{passwd:");
        stringBuilder.append(realmGet$passwd() != null ? realmGet$passwd() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{email:");
        stringBuilder.append(realmGet$email() != null ? realmGet$email() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{parent:");
        stringBuilder.append(realmGet$parent() != null ? realmGet$parent() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{sex:");
        stringBuilder.append(realmGet$sex());
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
        UserContentRealmProxy aUserContent = (UserContentRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aUserContent.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aUserContent.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aUserContent.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
