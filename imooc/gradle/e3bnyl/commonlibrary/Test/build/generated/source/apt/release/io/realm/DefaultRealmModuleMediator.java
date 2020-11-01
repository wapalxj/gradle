package io.realm;


import android.util.JsonReader;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>(5);
        modelClasses.add(com.imooc.viewpagertest.module.realm.User.class);
        modelClasses.add(com.imooc.viewpagertest.module.realm.UserContent.class);
        modelClasses.add(com.imooc.viewpagertest.module.search.BaseSearchModel.class);
        modelClasses.add(com.imooc.viewpagertest.module.search.ProductModel.class);
        modelClasses.add(com.imooc.viewpagertest.module.search.SearchModel.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        Map<Class<? extends RealmModel>, OsObjectSchemaInfo> infoMap = new HashMap<Class<? extends RealmModel>, OsObjectSchemaInfo>(5);
        infoMap.put(com.imooc.viewpagertest.module.realm.User.class, io.realm.UserRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.imooc.viewpagertest.module.realm.UserContent.class, io.realm.UserContentRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.imooc.viewpagertest.module.search.BaseSearchModel.class, io.realm.BaseSearchModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.imooc.viewpagertest.module.search.ProductModel.class, io.realm.ProductModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.imooc.viewpagertest.module.search.SearchModel.class, io.realm.SearchModelRealmProxy.getExpectedObjectSchemaInfo());
        return infoMap;
    }

    @Override
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> clazz, OsSchemaInfo schemaInfo) {
        checkClass(clazz);

        if (clazz.equals(com.imooc.viewpagertest.module.realm.User.class)) {
            return io.realm.UserRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.imooc.viewpagertest.module.realm.UserContent.class)) {
            return io.realm.UserContentRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.BaseSearchModel.class)) {
            return io.realm.BaseSearchModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.ProductModel.class)) {
            return io.realm.ProductModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.SearchModel.class)) {
            return io.realm.SearchModelRealmProxy.createColumnInfo(schemaInfo);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public List<String> getFieldNames(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(com.imooc.viewpagertest.module.realm.User.class)) {
            return io.realm.UserRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.imooc.viewpagertest.module.realm.UserContent.class)) {
            return io.realm.UserContentRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.BaseSearchModel.class)) {
            return io.realm.BaseSearchModelRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.ProductModel.class)) {
            return io.realm.ProductModelRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.SearchModel.class)) {
            return io.realm.SearchModelRealmProxy.getFieldNames();
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public String getSimpleClassNameImpl(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(com.imooc.viewpagertest.module.realm.User.class)) {
            return io.realm.UserRealmProxy.getSimpleClassName();
        }
        if (clazz.equals(com.imooc.viewpagertest.module.realm.UserContent.class)) {
            return io.realm.UserContentRealmProxy.getSimpleClassName();
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.BaseSearchModel.class)) {
            return io.realm.BaseSearchModelRealmProxy.getSimpleClassName();
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.ProductModel.class)) {
            return io.realm.ProductModelRealmProxy.getSimpleClassName();
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.SearchModel.class)) {
            return io.realm.SearchModelRealmProxy.getSimpleClassName();
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(com.imooc.viewpagertest.module.realm.User.class)) {
                return clazz.cast(new io.realm.UserRealmProxy());
            }
            if (clazz.equals(com.imooc.viewpagertest.module.realm.UserContent.class)) {
                return clazz.cast(new io.realm.UserContentRealmProxy());
            }
            if (clazz.equals(com.imooc.viewpagertest.module.search.BaseSearchModel.class)) {
                return clazz.cast(new io.realm.BaseSearchModelRealmProxy());
            }
            if (clazz.equals(com.imooc.viewpagertest.module.search.ProductModel.class)) {
                return clazz.cast(new io.realm.ProductModelRealmProxy());
            }
            if (clazz.equals(com.imooc.viewpagertest.module.search.SearchModel.class)) {
                return clazz.cast(new io.realm.SearchModelRealmProxy());
            }
            throw getMissingProxyClassException(clazz);
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.imooc.viewpagertest.module.realm.User.class)) {
            return clazz.cast(io.realm.UserRealmProxy.copyOrUpdate(realm, (com.imooc.viewpagertest.module.realm.User) obj, update, cache));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.realm.UserContent.class)) {
            return clazz.cast(io.realm.UserContentRealmProxy.copyOrUpdate(realm, (com.imooc.viewpagertest.module.realm.UserContent) obj, update, cache));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.BaseSearchModel.class)) {
            return clazz.cast(io.realm.BaseSearchModelRealmProxy.copyOrUpdate(realm, (com.imooc.viewpagertest.module.search.BaseSearchModel) obj, update, cache));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.ProductModel.class)) {
            return clazz.cast(io.realm.ProductModelRealmProxy.copyOrUpdate(realm, (com.imooc.viewpagertest.module.search.ProductModel) obj, update, cache));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.SearchModel.class)) {
            return clazz.cast(io.realm.SearchModelRealmProxy.copyOrUpdate(realm, (com.imooc.viewpagertest.module.search.SearchModel) obj, update, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public void insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(com.imooc.viewpagertest.module.realm.User.class)) {
            io.realm.UserRealmProxy.insert(realm, (com.imooc.viewpagertest.module.realm.User) object, cache);
        } else if (clazz.equals(com.imooc.viewpagertest.module.realm.UserContent.class)) {
            io.realm.UserContentRealmProxy.insert(realm, (com.imooc.viewpagertest.module.realm.UserContent) object, cache);
        } else if (clazz.equals(com.imooc.viewpagertest.module.search.BaseSearchModel.class)) {
            io.realm.BaseSearchModelRealmProxy.insert(realm, (com.imooc.viewpagertest.module.search.BaseSearchModel) object, cache);
        } else if (clazz.equals(com.imooc.viewpagertest.module.search.ProductModel.class)) {
            io.realm.ProductModelRealmProxy.insert(realm, (com.imooc.viewpagertest.module.search.ProductModel) object, cache);
        } else if (clazz.equals(com.imooc.viewpagertest.module.search.SearchModel.class)) {
            io.realm.SearchModelRealmProxy.insert(realm, (com.imooc.viewpagertest.module.search.SearchModel) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.imooc.viewpagertest.module.realm.User.class)) {
                io.realm.UserRealmProxy.insert(realm, (com.imooc.viewpagertest.module.realm.User) object, cache);
            } else if (clazz.equals(com.imooc.viewpagertest.module.realm.UserContent.class)) {
                io.realm.UserContentRealmProxy.insert(realm, (com.imooc.viewpagertest.module.realm.UserContent) object, cache);
            } else if (clazz.equals(com.imooc.viewpagertest.module.search.BaseSearchModel.class)) {
                io.realm.BaseSearchModelRealmProxy.insert(realm, (com.imooc.viewpagertest.module.search.BaseSearchModel) object, cache);
            } else if (clazz.equals(com.imooc.viewpagertest.module.search.ProductModel.class)) {
                io.realm.ProductModelRealmProxy.insert(realm, (com.imooc.viewpagertest.module.search.ProductModel) object, cache);
            } else if (clazz.equals(com.imooc.viewpagertest.module.search.SearchModel.class)) {
                io.realm.SearchModelRealmProxy.insert(realm, (com.imooc.viewpagertest.module.search.SearchModel) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.imooc.viewpagertest.module.realm.User.class)) {
                    io.realm.UserRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.imooc.viewpagertest.module.realm.UserContent.class)) {
                    io.realm.UserContentRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.imooc.viewpagertest.module.search.BaseSearchModel.class)) {
                    io.realm.BaseSearchModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.imooc.viewpagertest.module.search.ProductModel.class)) {
                    io.realm.ProductModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.imooc.viewpagertest.module.search.SearchModel.class)) {
                    io.realm.SearchModelRealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.imooc.viewpagertest.module.realm.User.class)) {
            io.realm.UserRealmProxy.insertOrUpdate(realm, (com.imooc.viewpagertest.module.realm.User) obj, cache);
        } else if (clazz.equals(com.imooc.viewpagertest.module.realm.UserContent.class)) {
            io.realm.UserContentRealmProxy.insertOrUpdate(realm, (com.imooc.viewpagertest.module.realm.UserContent) obj, cache);
        } else if (clazz.equals(com.imooc.viewpagertest.module.search.BaseSearchModel.class)) {
            io.realm.BaseSearchModelRealmProxy.insertOrUpdate(realm, (com.imooc.viewpagertest.module.search.BaseSearchModel) obj, cache);
        } else if (clazz.equals(com.imooc.viewpagertest.module.search.ProductModel.class)) {
            io.realm.ProductModelRealmProxy.insertOrUpdate(realm, (com.imooc.viewpagertest.module.search.ProductModel) obj, cache);
        } else if (clazz.equals(com.imooc.viewpagertest.module.search.SearchModel.class)) {
            io.realm.SearchModelRealmProxy.insertOrUpdate(realm, (com.imooc.viewpagertest.module.search.SearchModel) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.imooc.viewpagertest.module.realm.User.class)) {
                io.realm.UserRealmProxy.insertOrUpdate(realm, (com.imooc.viewpagertest.module.realm.User) object, cache);
            } else if (clazz.equals(com.imooc.viewpagertest.module.realm.UserContent.class)) {
                io.realm.UserContentRealmProxy.insertOrUpdate(realm, (com.imooc.viewpagertest.module.realm.UserContent) object, cache);
            } else if (clazz.equals(com.imooc.viewpagertest.module.search.BaseSearchModel.class)) {
                io.realm.BaseSearchModelRealmProxy.insertOrUpdate(realm, (com.imooc.viewpagertest.module.search.BaseSearchModel) object, cache);
            } else if (clazz.equals(com.imooc.viewpagertest.module.search.ProductModel.class)) {
                io.realm.ProductModelRealmProxy.insertOrUpdate(realm, (com.imooc.viewpagertest.module.search.ProductModel) object, cache);
            } else if (clazz.equals(com.imooc.viewpagertest.module.search.SearchModel.class)) {
                io.realm.SearchModelRealmProxy.insertOrUpdate(realm, (com.imooc.viewpagertest.module.search.SearchModel) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.imooc.viewpagertest.module.realm.User.class)) {
                    io.realm.UserRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.imooc.viewpagertest.module.realm.UserContent.class)) {
                    io.realm.UserContentRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.imooc.viewpagertest.module.search.BaseSearchModel.class)) {
                    io.realm.BaseSearchModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.imooc.viewpagertest.module.search.ProductModel.class)) {
                    io.realm.ProductModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.imooc.viewpagertest.module.search.SearchModel.class)) {
                    io.realm.SearchModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(com.imooc.viewpagertest.module.realm.User.class)) {
            return clazz.cast(io.realm.UserRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.realm.UserContent.class)) {
            return clazz.cast(io.realm.UserContentRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.BaseSearchModel.class)) {
            return clazz.cast(io.realm.BaseSearchModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.ProductModel.class)) {
            return clazz.cast(io.realm.ProductModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.SearchModel.class)) {
            return clazz.cast(io.realm.SearchModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(com.imooc.viewpagertest.module.realm.User.class)) {
            return clazz.cast(io.realm.UserRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.realm.UserContent.class)) {
            return clazz.cast(io.realm.UserContentRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.BaseSearchModel.class)) {
            return clazz.cast(io.realm.BaseSearchModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.ProductModel.class)) {
            return clazz.cast(io.realm.ProductModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.SearchModel.class)) {
            return clazz.cast(io.realm.SearchModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(com.imooc.viewpagertest.module.realm.User.class)) {
            return clazz.cast(io.realm.UserRealmProxy.createDetachedCopy((com.imooc.viewpagertest.module.realm.User) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.realm.UserContent.class)) {
            return clazz.cast(io.realm.UserContentRealmProxy.createDetachedCopy((com.imooc.viewpagertest.module.realm.UserContent) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.BaseSearchModel.class)) {
            return clazz.cast(io.realm.BaseSearchModelRealmProxy.createDetachedCopy((com.imooc.viewpagertest.module.search.BaseSearchModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.ProductModel.class)) {
            return clazz.cast(io.realm.ProductModelRealmProxy.createDetachedCopy((com.imooc.viewpagertest.module.search.ProductModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.imooc.viewpagertest.module.search.SearchModel.class)) {
            return clazz.cast(io.realm.SearchModelRealmProxy.createDetachedCopy((com.imooc.viewpagertest.module.search.SearchModel) realmObject, 0, maxDepth, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

}
