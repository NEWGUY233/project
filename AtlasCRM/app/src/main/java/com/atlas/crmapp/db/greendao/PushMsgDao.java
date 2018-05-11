package com.atlas.crmapp.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.atlas.crmapp.db.model.PushMsg;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "PUSH_MSG".
*/
public class PushMsgDao extends AbstractDao<PushMsg, Long> {

    public static final String TABLENAME = "PUSH_MSG";

    /**
     * Properties of entity PushMsg.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Title = new Property(1, String.class, "title", false, "TITLE");
        public final static Property Content = new Property(2, String.class, "content", false, "CONTENT");
        public final static Property Date = new Property(3, long.class, "date", false, "DATE");
        public final static Property Thumbnail = new Property(4, String.class, "thumbnail", false, "THUMBNAIL");
        public final static Property Type = new Property(5, String.class, "type", false, "TYPE");
        public final static Property ActionType = new Property(6, String.class, "actionType", false, "ACTION_TYPE");
        public final static Property Action = new Property(7, String.class, "action", false, "ACTION");
        public final static Property IsRead = new Property(8, int.class, "isRead", false, "IS_READ");
        public final static Property CouponId = new Property(9, long.class, "couponId", false, "COUPON_ID");
        public final static Property Price = new Property(10, String.class, "price", false, "PRICE");
        public final static Property Remark = new Property(11, String.class, "remark", false, "REMARK");
        public final static Property Have = new Property(12, boolean.class, "have", false, "HAVE");
    }


    public PushMsgDao(DaoConfig config) {
        super(config);
    }
    
    public PushMsgDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"PUSH_MSG\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"TITLE\" TEXT," + // 1: title
                "\"CONTENT\" TEXT," + // 2: content
                "\"DATE\" INTEGER NOT NULL ," + // 3: date
                "\"THUMBNAIL\" TEXT," + // 4: thumbnail
                "\"TYPE\" TEXT," + // 5: type
                "\"ACTION_TYPE\" TEXT," + // 6: actionType
                "\"ACTION\" TEXT," + // 7: action
                "\"IS_READ\" INTEGER NOT NULL ," + // 8: isRead
                "\"COUPON_ID\" INTEGER NOT NULL ," + // 9: couponId
                "\"PRICE\" TEXT," + // 10: price
                "\"REMARK\" TEXT," + // 11: remark
                "\"HAVE\" INTEGER NOT NULL );"); // 12: have
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"PUSH_MSG\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, PushMsg entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(2, title);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(3, content);
        }
        stmt.bindLong(4, entity.getDate());
 
        String thumbnail = entity.getThumbnail();
        if (thumbnail != null) {
            stmt.bindString(5, thumbnail);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(6, type);
        }
 
        String actionType = entity.getActionType();
        if (actionType != null) {
            stmt.bindString(7, actionType);
        }
 
        String action = entity.getAction();
        if (action != null) {
            stmt.bindString(8, action);
        }
        stmt.bindLong(9, entity.getIsRead());
        stmt.bindLong(10, entity.getCouponId());
 
        String price = entity.getPrice();
        if (price != null) {
            stmt.bindString(11, price);
        }
 
        String remark = entity.getRemark();
        if (remark != null) {
            stmt.bindString(12, remark);
        }
        stmt.bindLong(13, entity.getHave() ? 1L: 0L);
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, PushMsg entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(2, title);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(3, content);
        }
        stmt.bindLong(4, entity.getDate());
 
        String thumbnail = entity.getThumbnail();
        if (thumbnail != null) {
            stmt.bindString(5, thumbnail);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(6, type);
        }
 
        String actionType = entity.getActionType();
        if (actionType != null) {
            stmt.bindString(7, actionType);
        }
 
        String action = entity.getAction();
        if (action != null) {
            stmt.bindString(8, action);
        }
        stmt.bindLong(9, entity.getIsRead());
        stmt.bindLong(10, entity.getCouponId());
 
        String price = entity.getPrice();
        if (price != null) {
            stmt.bindString(11, price);
        }
 
        String remark = entity.getRemark();
        if (remark != null) {
            stmt.bindString(12, remark);
        }
        stmt.bindLong(13, entity.getHave() ? 1L: 0L);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public PushMsg readEntity(Cursor cursor, int offset) {
        PushMsg entity = new PushMsg( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // title
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // content
            cursor.getLong(offset + 3), // date
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // thumbnail
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // type
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // actionType
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // action
            cursor.getInt(offset + 8), // isRead
            cursor.getLong(offset + 9), // couponId
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // price
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // remark
            cursor.getShort(offset + 12) != 0 // have
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, PushMsg entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTitle(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setContent(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setDate(cursor.getLong(offset + 3));
        entity.setThumbnail(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setType(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setActionType(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setAction(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setIsRead(cursor.getInt(offset + 8));
        entity.setCouponId(cursor.getLong(offset + 9));
        entity.setPrice(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setRemark(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setHave(cursor.getShort(offset + 12) != 0);
     }
    
    @Override
    protected final Long updateKeyAfterInsert(PushMsg entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(PushMsg entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(PushMsg entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
