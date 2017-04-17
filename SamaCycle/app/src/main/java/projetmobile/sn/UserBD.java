package projetmobile.sn;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by SAMBA WARR on 05/02/2017.
 */

public class UserBD {
    CreationBD dbm;
    SQLiteDatabase db;

    public UserBD(Context ctx) {
       dbm =new CreationBD(ctx,"api",null,0);
;    }

    public void open(){

        db=dbm.getWritableDatabase();
    }
    public void close(){

        db.close();
    }
    public long adduser (Membres m){
        ContentValues vals=new ContentValues();
        vals.put("id",m.getId());
        vals.put("duree_cycle",m.getduree_cycle());
        vals.put("debut_regle",m.getduree_regle());
        vals.put("pseudo",m.getpseudo());

        return db.insert("membres",null,vals);
    }
}

