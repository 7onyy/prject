package com.example.mpklubartow.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "stops";
    private static final int DATABASE_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableQueryFirst = "CREATE TABLE IF NOT EXISTS stops_f ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "busStop TEXT, "
                + "time1 TIME, "
                + "time2 TIME, "
                + "time3 TIME, "
                + "time4 TIME, "
                + "time5 TIME, "
                + "time6 TIME, "
                + "time7 TIME, "
                + "time8 TIME)";
        db.execSQL(createTableQueryFirst);

        String insertDataQueryFirst = "INSERT INTO stops_f (busStop, time1, time2, time3, time4, time5, time6, time7, time8) "
                + "VALUES "
                + "('ul. Hutnicza', '05:00', '06:55', '08:50', '10:20', '14:00', '16:05', '18:00', '19:25'), "
                + "('ul. Kolejowa / DW PKP', '05:01', '06:56', '08:51', '10:21', '14:01', '16:06', '18:01', '19:26'), "
                + "('ul. Powstańców Warszawy', '05:02', '06:57', '08:52', '10:22', '14:02', '16:07', '18:02', '19:27'), "
                + "('ul. Cicha / Spółdzielnia Mieszkaniowa', '05:04', '06:59', '08:54', '10:24', '14:04', '16:09', '18:04', '19:29'), "
                + "('ul. 1 Maja / Topaz', '05:06', '07:01', '08:56', '10:26', '14:06', '16:11', '18:06', '19:31'), "
                + "('ul. Piaskowa / ul. 1 Maja', '05:07', '07:02', '08:57', '10:27', '14:07', '16:12', '18:07', '19:32'), "
                + "('ul. Łąkowa / ul. Piaskowa', '05:08', '07:03', '08:58', '10:28', '14:08', '16:13', '18:08', '19:33'), "
                + "('ul. Łąkowa / Szpital', '05:09', '07:04', '08:59', '10:29', '14:09', '16:14', '18:09', '19:34'), "
                + "('ul. Cicha / Policja', '05:10', '07:05', '09:00', '10:30', '14:10', '16:15', '18:10', '19:35'), "
                + "('ul. Lubelska / przy skrzyżowaniu z ul. Mickiewicza', '05:11', '07:06', '09:01', '10:31', '14:11', '16:16', '18:11', '19:36'), "
                + "('ul. Partyzancka / PEC', '05:13', '07:08', '09:03', '10:33', '14:13', '16:18', '18:13', '19:38'), "
                + "('ul. Farna / Targ', '05:14', '07:09', '09:04', '10:34', '14:14', '16:19', '18:14', '19:39'), "
                + "('ul. Szaniawskiego', '05:16', '07:11', '09:06', '10:36', '14:16', '16:21', '18:16', null), "
                + "('Aleje Tysiąclecia', '05:18', '07:13', '09:08', '10:38', '14:18', '16:23', '18:18', null), "
                + "('ul. Nowodworska', '05:19', '07:14', '09:09', '10:39', '14:19', '16:24', '18:19', null), "
                + "('ul. Lipowa III', '05:22', '07:17', '09:12', '10:42', '14:22', '16:27', '18:22', null), "
                + "('ul. Lipowa II', '05:23', '07:18', '09:13', '10:43', '14:23', '16:28', '18:23', null), "
                + "('ul. Lipowa I', '05:24', '07:19', '09:14', '10:44', '14:24', '16:29', '18:24', null), "
                + "('ul. Chopina / I LO', '05:25', '07:20', '09:15', '10:45', '14:25', '16:30', '18:25', '19:43'), "
                + "('ul. K. Jadwigi / Al. Zwycięstwa', '05:28', '07:23', '09:18', '10:48', '14:28', '16:33', '18:28', '19:46'), "
                + "('ul. Mieszka I / ul. Leśna', '05:30', '07:25', '09:20', '10:50', '14:30', '16:35', '18:30', '19:47'), "
                + "('Kopernika II', '05:32', '07:27', '09:22', '10:52', '14:32', '16:37', '18:32', '19:49'), "
                + "('ul. Polesie / ul. Kawalerzystów', '05:33', '07:28', '09:23', '10:53', '14:33', '16:38', '18:33', '19:50'), "
                + "('ul. Polesie / ul. Lotników', '05:34', '07:29', '09:24', '10:54', '14:34', '16:39', '18:34', '19:51'), "
                + "('ul. Kosmonautów / SP 4', '05:35', '07:30', '09:25', '10:55', '14:35', '16:40', '18:35', '19:52'), "
                + "('Lisów V / Kościół', '05:36', '07:31', '09:26', '10:56', '14:36', '16:41', '18:36', '19:53')";
        db.execSQL(insertDataQueryFirst);

        String createTableQuerySecond = "CREATE TABLE IF NOT EXISTS stops_s ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "busStop TEXT, "
                + "time1 TIME, "
                + "time2 TIME, "
                + "time3 TIME, "
                + "time4 TIME, "
                + "time5 TIME, "
                + "time6 TIME, "
                + "time7 TIME, "
                + "time8 TIME)";
        db.execSQL(createTableQuerySecond);

        String insertDataQuerySecond = "INSERT INTO stops_s (busStop, time1, time2, time3, time4, time5, time6, time7, time8) "
                + "VALUES "
                + "('Lisów V / Kościół', '05:40', '07:35', '09:30', '11:05', '13:15', '14:40', '16:45', '18:45'), "
                + "('ul. Kosmonautów / SP 4', '05:41', '07:36', '09:31', '11:06', '13:16', '14:41', '16:46', '18:46'), "
                + "('ul. Polesie / ul. Lotników', '05:42', '07:37', '09:32', '11:07', '13:17', '14:42', '16:47', '18:47'), "
                + "('ul. Polesie / ul. Kawalerzystów', '05:43', '07:38', '09:33', '11:08', '13:18', '14:43', '16:48', '18:48'), "
                + "('ul. Kopernika II', '05:44', '07:39', '09:34', '11:09', '13:19', '14:44', '16:49', '18:49'), "
                + "('ul. Mieszka I / ul. Leśna', '05:46', '07:41', '09:36', '11:11', '13:21', '14:46', '16:51', '18:51'), "
                + "('ul. K. Jadwigi / Al.Zwycięstwa', '05:47', '07:42', '09:37', '11:12', '13:22', '14:47', '16:52', '15:52'), "
                + "('ul. Lipowa I', '05:49', '07:44', '09:39', '11:14', '13:24', '14:49', '16:54', '18:54'), "
                + "('ul. Chopina / I LO', '05:52', '07:47', '09:42', '11:17', '13:27', '14:52', '16:57', '18:57'), "
                + "('ul. Lipowa II', '05:54', '07:49', '09:44', '11:19', '13:29', '14:54', '16:59', null), "
                + "('ul. Lipowa III', '05:56', '07:51', '09:46', '11:21', '13:31', '14:56', '17:01', null), "
                + "('ul. Nowodworska', '05:58', '07:53', '09:48', '11:23', '13:33', '14:58', '17:03', null), "
                + "('Aleje Tysiąclecia', '05:59', '07:54', '09:49', '11:24', '13:34', '14:59', '17:04', null), "
                + "('ul. Szaniawskiego', '06:02', '07:57', '09:52', '11:27', '13:37', '15:02', '17:07', '19:00'), "
                + "('ul. Farna / Targ', '06:03', '07:58', '09:53', '11:28', '13:38', '15:03', '17:08', '19:01'), "
                + "('ul. Partyzancka / PEC', '06:04', '07:59', '09:54', '11:29', '13:39', '15:04', '17:09', '19:02'), "
                + "('ul. Lubelska / przy skrzyżowaniu z ul. Mickiewicza', '06:06', '08:01', '09:56', '11:31', '13:41', '15:06', '17:11', '19:04'), "
                + "('ul. Cicha / Spółdzielnia Mieszkaniowa', '06:07', '08:02', '09:57', '11:32', '13:42', '15:07', '17:12', '19:05'), "
                + "('ul. Łąkowa / Szpital', '06:08', '08:03', '09:58', '11:33', '13:43', '15:08', '17:13', '19:06'), "
                + "('ul. Łąkowa / ul. Piaskowa', '06:09', '08:04', '09:59', '11:34', '13:44', '15:09', '17:14', '19:07'), "
                + "('ul. Piaskowa / ul. 1 Maja', '06:10', '08:05', '10:00', '11:35', '13:45', '15:10', '17:15', '19:08'), "
                + "('ul. 1 Maja / Topaz', '06:12', '08:07', '10:02', '11:37', '13:47', '15:12', '17:17', '19:10'), "
                + "('ul. Cicha / Policja', '06:13', '08:08', '10:03', '11:38', '13:48', '15:13', '17:18', '19:11'), "
                + "('ul. Powstańców Warszawy', '06:17', '08:12', '10:07', '11:42', '13:52', '15:17', '17:22', '19:15'), "
                + "('ul. Kolejowa / DW PKP', '06:18', '08:13', '10:08', '11:43', '13:53', '15:18', '17:23', '19:16'), "
                + "('ul. Hutnicza', '06:20', '08:15', '10:10', '11:45', '13:55', '15:20', '17:25', '19:18')";
        db.execSQL(insertDataQuerySecond);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // tutaj wykonujesz migracje bazy danych
    }

}
