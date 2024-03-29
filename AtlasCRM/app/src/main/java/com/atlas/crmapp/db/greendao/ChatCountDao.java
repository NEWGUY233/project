package com.atlas.crmapp.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.atlas.crmapp.db.model.ChatCount;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CHAT_COUNT".
*/
public class ChatCountDao extends AbstractDao<ChatCount, Long> {

    public static final String TABLENAME = "CHAT_COUNT";

    /**
     * Properties of entity ChatCount.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Identify = new Property(1, String.class, "identify", false, "IDENTIFY");
        public final static Property UserId = new Property(2, String.class, "userId", false, "USER_ID");
        public final static Property UnRead = new Property(3, long.class, "unRead", false, "UN_READ");
    }


    public ChatCountDao(DaoConfig config) {
        super(config);
    }
    
    public ChatCountDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CHAT_COUNT\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"IDENTIFY\" TEXT," + // 1: identify
                "\"USER_ID\" TEXT," + // 2: userId
                "\"UN_READ\" INTEGER NOT NULL );"); // 3: unRead
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CHAT_COUNT\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, ChatCount entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String identify = entity.getIdentify();
        if (identify != null) {
            stmt.bindString(2, identify);
        }
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(3, userId);
        }
        stmt.bindLong(4, entity.getUnRead());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, ChatCount entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String identify = entity.getIdentify();
        if (identify != null) {
            stmt.bindString(2, identify);
        }
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(3, userId);
        }
        stmt.bindLong(4, entity.getUnRead());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public ChatCount readEntity(Cursor cursor, int offset) {
        ChatCount entity = new ChatCount( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // identify
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // userId
            cursor.getLong(offset + 3) // unRead
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, ChatCount entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setIdentify(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setUserId(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setUnRead(cursor.getLong(offset + 3));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(ChatCount entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(ChatCount entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(ChatCount entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
