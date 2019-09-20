package com.example.test1;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.json.JSONObject;

public class MainActivity extends Activity {     // 声明组件
    private Spinner sr1;
    private Spinner sr2;
    private Spinner sr3;
    private Spinner sr4;
    private Button  showShortestPathbutton;
    private TextView textShowPaths;
    private String sr2Val = " ";
    private String sr4Val = " ";
    static String url = "http://139.9.90.185/getShortestPath?";

     @SuppressLint("NewApi")
     @Override
        protected void onCreate(Bundle savedInstanceState) {
                 super.onCreate(savedInstanceState);
                 setContentView(R.layout.activity_main);
                 sr1 =  this.findViewById(R.id.spinner1);
                 sr2 =  this.findViewById(R.id.spinner2);
                 sr3 =  this.findViewById(R.id.spinner3);
                 sr4 =  this.findViewById(R.id.spinner4);
                 textShowPaths = this.findViewById(R.id.showShortestPath);
                 textShowPaths.setMovementMethod(new ScrollingMovementMethod());

                 String[] station = getResources().getStringArray(R.array.station);
                 ArrayAdapter<CharSequence> aa = ArrayAdapter.createFromResource(this,
                                 R.array.station, android.R.layout.simple_spinner_dropdown_item);

                 aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                 sr1.setAdapter(aa);
                 sr3.setAdapter(aa);


                 sr1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                     @Override
                        public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                         // 得到事件中选中的值
                         Spinner s = (Spinner) arg0;
                         String pro = (String) s.getItemAtPosition(arg2);
//                                 sr2Val = pro;

                         // 获取所在省含有哪些市(从资源数组文件中获取数据)
                         ArrayAdapter<CharSequence> cityAdapter = null;
                         if (pro.equals("1")) {
                             cityAdapter = ArrayAdapter.createFromResource(
                                     MainActivity.this, R.array.station1,
                                     android.R.layout.simple_spinner_dropdown_item);
                             sr2.setAdapter(cityAdapter);
                             sr2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                 @Override
                                 public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                     String strstation = MainActivity.this.getResources().getStringArray(R.array.station1)[position];
                                     sr2Val = strstation;
                                 }

                                 @Override
                                 public void onNothingSelected(AdapterView<?> parent) {

                                 }

                             });
                         } else if (pro.equals("2")) {

                             cityAdapter = ArrayAdapter.createFromResource(
                                     MainActivity.this, R.array.station2,
                                     android.R.layout.simple_spinner_dropdown_item);
                             sr2.setAdapter(cityAdapter);
                             sr2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                 @Override
                                 public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                     String strstation = MainActivity.this.getResources().getStringArray(R.array.station2)[position];
                                     sr2Val = strstation;
                                 }

                                 @Override
                                 public void onNothingSelected(AdapterView<?> parent) {

                                 }

                             });
                         } else if (pro.equals("3")) {

                             cityAdapter = ArrayAdapter.createFromResource(
                                     MainActivity.this, R.array.station3,
                                     android.R.layout.simple_spinner_dropdown_item);
                             sr2.setAdapter(cityAdapter);
                             sr2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                 @Override
                                 public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                     String strstation = MainActivity.this.getResources().getStringArray(R.array.station3)[position];
                                     sr2Val = strstation;
                                 }

                                 @Override
                                 public void onNothingSelected(AdapterView<?> parent) {

                                 }

                             });
                         } else if (pro.equals("5")) {

                             cityAdapter = ArrayAdapter.createFromResource(
                                     MainActivity.this, R.array.station5,
                                     android.R.layout.simple_spinner_dropdown_item);
                             sr2.setAdapter(cityAdapter);
                             sr2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                 @Override
                                 public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                     String strstation = MainActivity.this.getResources().getStringArray(R.array.station5)[position];
                                     sr2Val = strstation;
                                 }

                                 @Override
                                 public void onNothingSelected(AdapterView<?> parent) {

                                 }

                             });
                         } else if (pro.equals("6")) {

                             cityAdapter = ArrayAdapter.createFromResource(
                                     MainActivity.this, R.array.station6,
                                     android.R.layout.simple_spinner_dropdown_item);
                             sr2.setAdapter(cityAdapter);
                             sr2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                 @Override
                                 public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                     String strstation = MainActivity.this.getResources().getStringArray(R.array.station6)[position];
                                     sr2Val = strstation;
                                 }

                                 @Override
                                 public void onNothingSelected(AdapterView<?> parent) {

                                 }

                             });
                         } else if (pro.equals("9")) {

                             cityAdapter = ArrayAdapter.createFromResource(
                                     MainActivity.this, R.array.station9,
                                     android.R.layout.simple_spinner_dropdown_item);
                             sr2.setAdapter(cityAdapter);
                             sr2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                 @Override
                                 public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                     String strstation = MainActivity.this.getResources().getStringArray(R.array.station9)[position];
                                     sr2Val = strstation;
                                 }

                                 @Override
                                 public void onNothingSelected(AdapterView<?> parent) {

                                 }

                             });
                         }
                     }


                     @Override
                     public void onNothingSelected(AdapterView<?> arg0) {
                         // TODO Auto-generated method stub

                     }

                 });




                         sr3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                             @Override
                             public void onItemSelected(AdapterView<?> arg0, View arg1, final int arg2, long arg3) {
                                 // 得到事件中选中的值
                                 Spinner s = (Spinner) arg0;
                                 String pro = (String) s.getItemAtPosition(arg2);
//                                 sr4Val = pro;

                                 // 获取所在省含有哪些市(从资源数组文件中获取数据)
                                 ArrayAdapter<CharSequence> cityAdapter = null;
                                 if (pro.equals("1")) {
                                     cityAdapter = ArrayAdapter.createFromResource(
                                             MainActivity.this, R.array.station1,
                                             android.R.layout.simple_spinner_dropdown_item);
                                     sr4.setAdapter(cityAdapter);
                                     sr4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                         @Override
                                         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                             String strstation = MainActivity.this.getResources().getStringArray(R.array.station1)[position];
                                             sr4Val = strstation;
                                         }

                                         @Override
                                         public void onNothingSelected(AdapterView<?> parent) {

                                         }

                                     });
                                 } else if (pro.equals("2")) {

                                     cityAdapter = ArrayAdapter.createFromResource(
                                             MainActivity.this, R.array.station2,
                                             android.R.layout.simple_spinner_dropdown_item);
                                     sr4.setAdapter(cityAdapter);
                                     sr4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                         @Override
                                         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                             String strstation = MainActivity.this.getResources().getStringArray(R.array.station2)[position];
                                             sr4Val = strstation;
                                         }

                                         @Override
                                         public void onNothingSelected(AdapterView<?> parent) {

                                         }

                                     });
                                 } else if (pro.equals("3")) {

                                     cityAdapter = ArrayAdapter.createFromResource(
                                             MainActivity.this, R.array.station3,
                                             android.R.layout.simple_spinner_dropdown_item);
                                     sr4.setAdapter(cityAdapter);
                                     sr4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                         @Override
                                         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                             String strstation = MainActivity.this.getResources().getStringArray(R.array.station3)[position];
                                             sr4Val = strstation;
                                         }

                                         @Override
                                         public void onNothingSelected(AdapterView<?> parent) {

                                         }

                                     });
                                 } else if (pro.equals("5")) {

                                     cityAdapter = ArrayAdapter.createFromResource(
                                             MainActivity.this, R.array.station5,
                                             android.R.layout.simple_spinner_dropdown_item);
                                     sr4.setAdapter(cityAdapter);
                                     sr4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                         @Override
                                         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                             String strstation = MainActivity.this.getResources().getStringArray(R.array.station5)[position];
                                             sr4Val = strstation;
                                         }

                                         @Override
                                         public void onNothingSelected(AdapterView<?> parent) {

                                         }

                                     });
                                 } else if (pro.equals("6")) {

                                     cityAdapter = ArrayAdapter.createFromResource(
                                             MainActivity.this, R.array.station6,
                                             android.R.layout.simple_spinner_dropdown_item);
                                     sr4.setAdapter(cityAdapter);
                                     sr4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                         @Override
                                         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                             String strstation = MainActivity.this.getResources().getStringArray(R.array.station6)[position];
                                             sr4Val = strstation;
                                         }

                                         @Override
                                         public void onNothingSelected(AdapterView<?> parent) {

                                         }

                                     });
                                 } else if (pro.equals("9")) {

                                     cityAdapter = ArrayAdapter.createFromResource(
                                             MainActivity.this, R.array.station9,
                                             android.R.layout.simple_spinner_dropdown_item);
                                     sr4.setAdapter(cityAdapter);
                                     sr4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                         @Override
                                         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                             String strstation = MainActivity.this.getResources().getStringArray(R.array.station9)[position];
                                             sr4Val = strstation;
                                         }

                                         @Override
                                         public void onNothingSelected(AdapterView<?> parent) {

                                         }

                                     });
                                 }
                             }


                             @Override
                             public void onNothingSelected(AdapterView<?> arg0) {
                                 // TODO Auto-generated method stub

                             }

                         });


                showShortestPathbutton = findViewById(R.id.searchButton);
                showShortestPathbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this,"正在搜索中,请稍后",Toast.LENGTH_SHORT).show();
                        try {
                            System.out.println(sr2Val+" "+sr4Val);
                            SendGetRequest(url,sr2Val,sr4Val);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });

            }

    public void SendGetRequest(final String url,final String startpos,final  String endpos){

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    OkHttpClient client = new OkHttpClient();//创建OkHttpClient对象
                    Request request = new Request.Builder()
                            .url("http://139.9.90.185/getShortestPath?start="+startpos+"&end="+endpos)//请求接口。如果需要传参拼接到接口后面。
                            .build();//创建Request 对象
                    Response response = null;
                    response = client.newCall(request).execute();//得到Response 对象
                    if (response.isSuccessful()) {
                        Log.d("kwwl","response.code()=="+response.code());
                        Log.d("kwwl","response.message()=="+response.message());
//                        Log.d("kwwl","res=="+response.body().string());
                        String resdata = response.body().string();
                        System.out.println(resdata);

                        //此时的代码执行在子线程，修改UI的操作请使用handler跳转到UI线程。
                            JSONObject jsonObject = new JSONObject(resdata);
                            String code = (jsonObject.getString("code"));
                            if(Integer.parseInt(code)==0) {
                                String resultpath = (jsonObject.getString("msg"));
                                String resultnum = (jsonObject.getString("stationnum"));
                                show("站点数:" + resultnum + "\n" + "站点最短路径:" + resultpath);
                            }else{
                                String msg = (jsonObject.getString("msg"));
                                show("提示信息:"+msg);
                            }
//                            System.out.println(result);
                    }else{
                        show("请求出错,请选择正确的站点请求");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();


    }

    private void show(final String result) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                textShowPaths.setText(result);
            }
        });
    }




         }