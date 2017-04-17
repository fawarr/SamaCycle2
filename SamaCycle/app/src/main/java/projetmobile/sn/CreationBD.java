package projetmobile.sn;

        import android.database.sqlite.SQLiteDatabase;
        import android.content.ContentValues;
        import android.content.Context;
        import android.database.Cursor;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;


public class CreationBD extends SQLiteOpenHelper {

    public CreationBD(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

   // String tag="Creation bd";
  //  public static final String DATABASE_NAME="api";
   // public static final String TABLE_NAME="membres";
   // public static final String Id="id";
   // public static final String Duree_cycle="duree_cycle";
   // public static final String Duree_regle="duree_regle";

   // int duree_cycle;
  //  int duree_regle;
  //  public static final String pseudo="ps";
   // public CreationBD(Context context){
     //   super(context,DATABASE_NAME,null,1);
        //Log.i(tag,"Constructeur");
  //  }
    @Override
    public void onCreate(SQLiteDatabase db) {
        // Log.i(tag,"Creation ");
        db.execSQL("CREATE TABLE membres( id INTEGER PRIMARY KEY AUTOINCREMENT,d_c INTEGER,d_r INTEGER,ps  TEXT);");
        //Log.i(tag,"Fin Creation");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Log.i(tag,"upgrate ");
        db.execSQL("DROP TABLE IF EXIST membres");
        onCreate(db);
        //Log.i(tag,"Fin upgrate");
    }

   //public void enregistre(Membres m){
     //   ContentValues v = new ContentValues();
      //  duree_cycle=m.getduree_cycle();
       // duree_regle=m.getduree_regle();
        //v.put(pseudo,m.getpseudo());
        //Integer id = m.getId();
        //Long result =db.insert(m,null,ContentValues),
   // }
    /*public Cursor getAllmembres(){
        return this.getReadableDatabase().rawQuery("select *from"+T_membres,null);
    }*/
}

