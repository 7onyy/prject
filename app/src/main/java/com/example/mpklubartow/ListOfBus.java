package com.example.mpklubartow;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.mpklubartow.db.DatabaseHelper;

import java.util.ArrayList;

public class ListOfBus extends AppCompatActivity {

    TextView fromTime;
    TextView toTime;
    TextView time;
    TextView fromTime2;
    TextView toTime2;
    TextView time2;
    TextView fromTime3;
    TextView toTime3;
    TextView time3;
    TextView fromTime4;
    TextView toTime4;
    TextView time4;
    TextView fromTime5;
    TextView toTime5;
    TextView time5;
    TextView fromTime6;
    TextView toTime6;
    TextView time6;
    TextView fromTime7;
    TextView toTime7;
    TextView time7;
    TextView fromTime8;
    TextView toTime8;
    TextView time8;
    RecyclerAdapter adapter;
    RecyclerView listOfBus;
    private ArrayList<String> txtFrom=new ArrayList<>();
    private ArrayList<String> txtTo=new ArrayList<>();
    private ArrayList<String> txtTime=new ArrayList<>();

    public void createViews(){
        fromTime=findViewById(R.id.departueTime);
        toTime=findViewById(R.id.arrivalTime);
        time=findViewById(R.id.timeValue);
        fromTime2=findViewById(R.id.departue2);
        toTime2=findViewById(R.id.arrivalTime2);
        time2=findViewById(R.id.timeValue2);
        fromTime3=findViewById(R.id.departue3);
        toTime3=findViewById(R.id.arrivalTime3);
        time3=findViewById(R.id.timeValue3);
        fromTime4=findViewById(R.id.departue4);
        toTime4=findViewById(R.id.arrivalTime4);
        time4=findViewById(R.id.timeValue4);
        fromTime5=findViewById(R.id.departue5);
        toTime5=findViewById(R.id.arrivalTime5);
        time5=findViewById(R.id.timeValue5);
        fromTime6=findViewById(R.id.departue6);
        toTime6=findViewById(R.id.arrivalTime6);
        time6=findViewById(R.id.timeValue6);
        fromTime7=findViewById(R.id.departue7);
        toTime7=findViewById(R.id.arrivalTime7);
        time7=findViewById(R.id.timeValue7);
        fromTime8=findViewById(R.id.departue8);
        toTime8=findViewById(R.id.arrivalTime8);
        time8=findViewById(R.id.timeValue8);
    }

    @SuppressLint({"MissingInflatedId", "Recycle"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_of_buses);

        Bundle extras = getIntent().getExtras();
        //String from = extras.getString("from");
        //String to = extras.getString("to");
        //int from_p = extras.getInt("from_p");
        //int to_p = extras.getInt("to_p");
        String from = "ul. Hutnicza";
        String to = "ul. Kolejowa / DW PKP";
        int from_p = 1;
        int to_p = 2;

        createViews();

        //listOfBus=findViewById(R.id.recycleView);
        //listOfBus.setLayoutManager(new LinearLayoutManager(ListOfBus.this));

        // Tworzymy obiekt klasy DatabaseHelper
        DatabaseHelper dbHelper = new DatabaseHelper(this);

        // Otwieramy bazę danych do odczytu
        SQLiteDatabase db = dbHelper.getReadableDatabase();


        if (from_p<to_p){
            for (int i = 1; i <= 8; i++) {
                //SQL zapytanie
                String query1= "select time"+i+" from stops_f where busStop='"+from+"';";
                String query2= "select time"+i+" from stops_f where busStop='"+to+"';";
                String query3= "select julianday('select time"+i+" from stops_f where busStop="+from+"') - " +
                        "julianday('select time"+i+" from stops_f where busStop="+to+"')";

                // Wykonujemy zapytanie do bazy danych
                Cursor cursor1 = db.rawQuery(query1, null);
                Cursor cursor2 = db.rawQuery(query2, null);
                Cursor cursor3 = db.rawQuery(query3, null);

                // Pobieramy wartość z kolumny do listy
                if (cursor1.moveToFirst()) {
                    txtFrom.add(cursor1.getString(0));
                }

                if (cursor2.moveToFirst()) {
                    txtTo.add(cursor2.getString(0));
                }

                if (cursor3.moveToFirst()) {
                    txtTime.add(cursor3.getString(0));
                }

                // Uwolnij zasoby kursorów
                cursor1.close();
                cursor2.close();
                cursor3.close();

                /*String sql = "select time"+i+" from STOPS where busStop='"+from+"';";
                txtFrom = String.valueOf(statement.execute(sql));
                fromTime.setText(txtFrom);

                String sql2 = "select time"+i+" from STOPS where busStop='"+to+"';";
                txtTo = String.valueOf(statement.execute(sql2));
                toTime.setText(txtTo);

                String sql3 = "select DATEDIFF( MINUTE , (select time"+i+" from STOPS where busStop='"+from+"'), (select time"+i+" from STOPS where busStop='"+to+"'))";
                txtTime = String.valueOf(statement.execute(sql3));
                time.setText(txtTime);*/
        }}else if(to_p<from_p){
            for (int i = 1; i <= 8; i++) {
                //SQL zapytanie
                String query1= "select time"+i+" from stops_s where busStop='"+from+"';";
                String query2= "select time"+i+" from stops_s where busStop='"+to+"';";
                String query3= "";

                // Wykonujemy zapytanie do bazy danych
                Cursor cursor1 = db.rawQuery(query1, null);
                Cursor cursor2 = db.rawQuery(query2, null);
                Cursor cursor3 = db.rawQuery(query3, null);

                // Pobieramy wartość z kolumny
                if (cursor1.moveToFirst()) {
                    txtFrom.add(cursor1.getString(0));
                }

                if (cursor2.moveToFirst()) {
                    txtTo.add(cursor2.getString(0));
                }

                if (cursor3.moveToFirst()) {
                    txtTime.add(cursor3.getString(0));
                }

                // Uwolnij zasoby kursorów
                cursor1.close();
                cursor2.close();
                cursor3.close();

                /*String sql = "select time"+i+" from STOPS_2 where busStop='"+from+"';";
                txtFrom = String.valueOf(statement.execute(sql));
                fromTime.setText(txtFrom);

                String sql2 = "select time"+i+" from STOPS_2 where busStop='"+to+"';";
                txtTo = String.valueOf(statement.execute(sql2));
                toTime.setText(txtTo);

                String sql3 = "select DATEDIFF( MINUTE , (select time"+i+" from STOPS_2 where busStop='"+from+"'), (select time"+i+" from STOPS_2 where busStop='"+to+"'))";
                txtTime = String.valueOf(statement.execute(sql3));
                time.setText(txtTime);*/
            }
        }
        // Zamykamy bazę danych
        db.close();

        fromTime.setText(txtFrom.get(0));
        toTime.setText(txtTo.get(0));
        time.setText(txtTime.get(0));
        //fromTime2.setText(txtFrom.get(1));
        //toTime2.setText(txtTo.get(1));
        //time2.setText(txtTime.get(1));
        //fromTime3.setText(txtFrom.get(2));
        //toTime3.setText(txtTo.get(2));
        //time3.setText(txtTime.get(2));
        //fromTime4.setText(txtFrom.get(3));
        //toTime4.setText(txtTo.get(3));
        //time4.setText(txtTime.get(3));
        //fromTime5.setText(txtFrom.get(4));
        //toTime5.setText(txtTo.get(4));
        //time5.setText(txtTime.get(4));
        //fromTime6.setText(txtFrom.get(5));
        //toTime6.setText(txtTo.get(5));
        //time6.setText(txtTime.get(5));
        //fromTime7.setText(txtFrom.get(6));
        //toTime7.setText(txtTo.get(6));
        //time7.setText(txtTime.get(6));
        //fromTime8.setText(txtFrom.get(7));
        //toTime8.setText(txtTo.get(7));
        //time8.setText(txtTime.get(7));



        //connection.close();
        //adapter = new RecyclerAdapter(txtFrom, txtTime, txtTo, ListOfBus.this);
        //listOfBus.setAdapter(adapter);
    }
}