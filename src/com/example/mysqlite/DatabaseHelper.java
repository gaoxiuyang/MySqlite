package com.example.mysqlite;

import android.content.Context;  
import android.database.sqlite.SQLiteDatabase;  
import android.database.sqlite.SQLiteOpenHelper;  
import android.database.sqlite.SQLiteDatabase.CursorFactory;  
  
/** 
 * SQLiteOpenHelper��һ�������࣬�����������ݿ�Ĵ����Ͱ汾�������ṩ��������Ĺ��� 
 * ��һ��getReadableDatabase()��getWritableDatabase()���Ի��SQLiteDatabase����ͨ���ö�����Զ����ݿ���в��� 
 * �ڶ����ṩ��onCreate()��onUpgrade()�����ص����������������ٴ������������ݿ�ʱ�������Լ��Ĳ��� 
 */  
public class DatabaseHelper extends SQLiteOpenHelper {  
    private static final int VERSION = 1;  
  
    /** 
     * ��SQLiteOpenHelper�����൱�У������иù��캯�� 
     * @param context   �����Ķ��� 
     * @param name      ���ݿ����� 
     * @param factory 
     * @param version   ��ǰ���ݿ�İ汾��ֵ���������������ǵ�����״̬ 
     */  
    public DatabaseHelper(Context context, String name, CursorFactory factory,  
            int version) {  
        //����ͨ��super���ø��൱�еĹ��캯��  
        super(context, name, factory, version);  
    }  
      
    public DatabaseHelper(Context context, String name, int version){  
        this(context,name,null,version);  
    }  
  
    public DatabaseHelper(Context context, String name){  
        this(context,name,VERSION);  
    }  
  
    //�ú������ڵ�һ�δ�����ʱ��ִ�У�ʵ�����ǵ�һ�εõ�SQLiteDatabase�����ʱ��Ż�����������  
    @Override  
    public void onCreate(SQLiteDatabase db) {  
        // TODO Auto-generated method stub  
        System.out.println("create a database");  
        //execSQL����ִ��SQL���  
        db.execSQL("create table user(id int,name varchar(20))");  
    }  
  
    @Override  
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {  
        // TODO Auto-generated method stub  
        System.out.println("upgrade a database");  
    }  
}