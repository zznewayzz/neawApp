package com.example.mynamekarn.neaw03;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends Activity{

    ListView list;
    String[] itemname ={
            "사랑 - Sarang",
            "ร้านตุลย์",
            "Vip ส้มตำ Club ต้นตำรับ มข.",
            "โจ๊กขอนแก่น 2516 - by โจ๊กคุณแอ๋ม",
            "Sri Brown Cafe' (ศรี บราวน์ คาเฟ่) ",
            "สรวลหรรษา (Suanhunsa)",
            "Mama Big",
            "La Pine Dessert and Cafe'",
            "Holla Café Coffee & Bakery",
            "Hippo House",
            "ร้าน ชาบูอินดี้ ขอนแก่น (Shabu Indy) ขอนแก่น",
            "september-coffee",
            "ก๋วยเตี๋ยวเรือสิบสาม",
            "Have a break",
            "สุกี้นายพัน",
            "CafeMe2",
            "SweetDay SnowIce",
            "See bear Cafe'",
            "Smith. Fried Chicken, Steak & Coffee",
            "ตี 5 - Breakfast",
            "Just noodle Bar",
            "บ้านมอ Bakery & Coffee",
            "แล้วแต่ Food&Drink Bar",
            "วีที แหนมเนือง สาขาหลัง มข. The Red Roof"
    };

    String[] listdesc ={
            "อาหารเกาหลี",
            "ก๋วยเตี๋ยวหมูตุ๋น",
            "ส้มตำ ตำถาด อาหารตามสั่ง",
            "โจ๊ก ข้าวต้ม เกาเหลา",
            "กาแฟ เบเกอรี่ เค้ก ของหวาน",
            "เที่ยวกลางคืน ผับ อาหารตามสั่ง แอลกอฮอล์",
            "อาหารอิตาเลี่ยน อาหารจานเดียว ตามสั่ง เบเกอรี่ เค้ก",
            "ของหวาน เค้ก",
            "ของหวาน เค้ก กาแฟ อาหารจานเดียว",
            "กาแฟ พิซซ่า อาหารอิตาเลี่ยน อาหารไทย อาหารจานเดียว",
            "สุกี้ ชาบู บุพเฟ่ต์",
            "กาแฟ น้ำผลไม้ เครื่องดื่ม ชานมไข่มุก",
            "ก๋วยเตี๋ยว อาหารตามสั่ง ไก่ทอด",
            "กาแฟ เบเกอรี่ เค้ก ของหวาน",
            "สุกี้ี้ ก๋วยเตี๋ยว",
            "กาแฟ เบเกอรี่ เค้ก ของหวาน อาหารจานเดียว",
            "กาแฟ น้ำผลไม้ ของหวาน อาหารจานเดียว ไอสครีม",
            "กาแฟ เค้ก ของหวาน",
            "กาแฟ สเต๊ก อาหารอิตาเลี่ยน",
            "อาหารเวียดนาม",
            "อาหารไทย อาหารอิตาเลี่ยน อาหารตามสั่ง ของหวาน",
            "กาแฟ เค้ก เบเกอรี่ ฟาร์ตฟูด",
            "อาหารตามสั่ง ข้าวผัดกะเพรา",
            "แหนมเนือง อาหารตามสั่ง"

    };
    String[] listarea = {
            "หลังมอ",
            "หลังมอ",
            "กังสดาล",
            "ศูนย์กาญจนาฯ",
            "กังสดาล , หลังมอ",
            "กังสดาล",
            "กังสดาล",
            "กังสดาล",
            "กังสดาล",
            "ศูนย์กาญจนาฯ",
            "ศูนย์กาญจนาฯ",
            "ตลาดเจ๊พร",
            "หลังมอ",
            "หลังมอ",
            "หลังมอ",
            "หลังมอ",
            "หลังมอ",
            "หลังมอ",
            "หลังมอ",
            "หลังมอ",
            "หลังมอ",
            "หลังมอ",
            "หลังมอ",
            "หลังมอ",
    };

    String[] contact = {
            "https://goo.gl/0sZDMY",
            "https://goo.gl/uaK1VL",
            "https://goo.gl/zsdrte",
            "https://goo.gl/wBWBBa",
            "https://www.facebook.com/Sribrowncafe",
            "https://www.facebook.com/suanhunsa",
            "https://www.facebook.com/mamabigkk/",
            "https://www.facebook.com/LaPinedessertcafe",
            "https://www.facebook.com/hollacafekhonkaen",
            "https://www.facebook.com/hippohousekhonkaen",
            "https://www.facebook.com/Shabu-Indy-Khonkaen-535851563228216/",
            "https://www.facebook.com/septembercoffee.kku/",
            "https://goo.gl/FvQiWW",
            "https://www.facebook.com/haveabreakbakery/",
            "https://www.facebook.com/SukiNayPhan.KKU",
            "https://www.facebook.com/me2.cafe/",
            "https://www.facebook.com/SweetDaySnowIce/",
            "https://www.facebook.com/seebearcafe",
            "https://www.facebook.com/Smith-Fried-Chicken-Steak-Coffee-259410977588380/",
            "https://goo.gl/A19ISe",
            "https://www.facebook.com/justnoodlebar",
            "https://www.facebook.com/banmorebakery/",
            "https://www.facebook.com/Laewtaebar",
            "https://goo.gl/U4T3ya",
    };

    Integer[] imgid={
            R.drawable.rac1,
            R.drawable.rac2,
            R.drawable.rac3,
            R.drawable.rac4,
            R.drawable.rac5,
            R.drawable.rac6,
            R.drawable.rac7,
            R.drawable.rac8,
            R.drawable.rac9,
            R.drawable.rac10,
            R.drawable.rac11,
            R.drawable.rac12,
            R.drawable.rac13,
            R.drawable.rac14,
            R.drawable.rac15,
            R.drawable.rac16,
            R.drawable.rac17,
            R.drawable.rac18,
            R.drawable.rac19,
            R.drawable.rac20,
            R.drawable.rac21,
            R.drawable.rac22,
            R.drawable.rac23,
            R.drawable.rac24,
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter adapter = new CustomListAdapter(this, itemname, listarea, imgid, listdesc, contact);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

        Button btn2 = (Button) findViewById(R.id.button4);
        Button btn3 = (Button) findViewById(R.id.button5);


        View.OnClickListener btn2OnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int nn = rand.nextInt(23);
                Intent intent = null;

                switch (nn){
                    case 0:
                        intent = new Intent(getApplicationContext(),res0.class);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), res1.class);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(), res2.class);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), res3.class);
                        break;
                    case 4:
                        intent = new Intent(getApplicationContext(), res4.class);
                        break;
                    case 5:
                        intent = new Intent(getApplicationContext(), res5.class);
                        break;
                    case 6:
                        intent = new Intent(getApplicationContext(), res6.class);
                        break;
                    case 7:
                        intent = new Intent(getApplicationContext(), res7.class);
                        break;
                    case 8:
                        intent = new Intent(getApplicationContext(), res8.class);
                        break;
                    case 9:
                        intent = new Intent(getApplicationContext(), res9.class);
                        break;
                    case 10:
                        intent = new Intent(getApplicationContext(), res10.class);
                        break;
                    case 11:
                        intent = new Intent(getApplicationContext(), res11.class);
                        break;
                    case 12:
                        intent = new Intent(getApplicationContext(), res12.class);
                        break;
                    case 13:
                        intent = new Intent(getApplicationContext(), res13.class);
                        break;
                    case 14:
                        intent = new Intent(getApplicationContext(), res14.class);
                        break;
                    case 15:
                        intent = new Intent(getApplicationContext(), res15.class);
                        break;
                    case 16:
                        intent = new Intent(getApplicationContext(), res16.class);
                        break;
                    case 17:
                        intent = new Intent(getApplicationContext(), res17.class);
                        break;
                    case 18:
                        intent = new Intent(getApplicationContext(), res18.class);
                        break;
                    case 19:
                        intent = new Intent(getApplicationContext(), res19.class);
                        break;
                    case 20:
                        intent = new Intent(getApplicationContext(), res20.class);
                        break;
                    case 21:
                        intent = new Intent(getApplicationContext(), res21.class);
                        break;
                    case 22:
                        intent = new Intent(getApplicationContext(), res22.class);
                        break;
                    case 23:
                        intent = new Intent(getApplicationContext(), res23.class);
                        break;
                }
                startActivity(intent);
                /*String Slecteditem = itemname[+nn];
                Toast.makeText(MainActivity.this, Slecteditem, Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse(contact[+nn]); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);*/
            }
        };

        View.OnClickListener btn3OnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenttt = null;
                Random rand = new Random();
                int nn = rand.nextInt(13);
                switch (nn){
                    case 0:
                        intenttt = new Intent(getApplicationContext(), Dia1.class);
                        break;
                    case 1:
                        intenttt = new Intent(getApplicationContext(), Dia2.class);
                        break;
                    case 2:
                        intenttt = new Intent(getApplicationContext(), Dia3.class);
                        break;
                    case 3:
                        intenttt = new Intent(getApplicationContext(), Dia4.class);
                        break;
                    case 4:
                        intenttt = new Intent(getApplicationContext(), Dia5.class);
                        break;
                    case 5:
                        intenttt = new Intent(getApplicationContext(), Dia6.class);
                        break;
                    case 6:
                        intenttt = new Intent(getApplicationContext(), Dia7.class);
                        break;
                    case 7:
                        intenttt = new Intent(getApplicationContext(), Dia8.class);
                        break;
                    case 8:
                        intenttt = new Intent(getApplicationContext(), Dia9.class);
                        break;
                    case 9:
                        intenttt = new Intent(getApplicationContext(), Dia10.class);
                        break;
                    case 10:
                        intenttt = new Intent(getApplicationContext(), Dia11.class);
                        break;
                    case 11:
                        intenttt = new Intent(getApplicationContext(), Dia12.class);
                        break;
                    case 12:
                        intenttt = new Intent(getApplicationContext(), Dia13.class);
                        break;
                    case 13:
                        intenttt = new Intent(getApplicationContext(), Dia14.class);
                        break;
                }
                startActivity(intenttt);
            }
        };


        btn2.setOnClickListener(btn2OnClickListener);
        btn3.setOnClickListener(btn3OnClickListener);

        list.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem = itemname[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

                MyDesc.result(itemname[+position],listdesc[+position],listarea[+position],contact[+position],imgid[+position]);


                //Uri uri = Uri.parse(contact[+position]); // missing 'http://' will cause crashed
                //Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                //startActivity(intent);

                Intent intentt = null;

                switch (position){
                    case 0:
                        intentt = new Intent(getApplicationContext(),res0.class);
                        break;
                    case 1:
                        intentt = new Intent(getApplicationContext(), res1.class);
                        break;
                    case 2:
                        intentt = new Intent(getApplicationContext(), res2.class);
                        break;
                    case 3:
                        intentt = new Intent(getApplicationContext(), res3.class);
                        break;
                    case 4:
                        intentt = new Intent(getApplicationContext(), res4.class);
                        break;
                    case 5:
                        intentt = new Intent(getApplicationContext(), res5.class);
                        break;
                    case 6:
                        intentt = new Intent(getApplicationContext(), res6.class);
                        break;
                    case 7:
                        intentt = new Intent(getApplicationContext(), res7.class);
                        break;
                    case 8:
                        intentt = new Intent(getApplicationContext(), res8.class);
                        break;
                    case 9:
                        intentt = new Intent(getApplicationContext(), res9.class);
                        break;
                    case 10:
                        intentt = new Intent(getApplicationContext(), res10.class);
                        break;
                    case 11:
                        intentt = new Intent(getApplicationContext(), res11.class);
                        break;
                    case 12:
                        intentt = new Intent(getApplicationContext(), res12.class);
                        break;
                    case 13:
                        intentt = new Intent(getApplicationContext(), res13.class);
                        break;
                    case 14:
                        intentt = new Intent(getApplicationContext(), res14.class);
                        break;
                    case 15:
                        intentt = new Intent(getApplicationContext(), res15.class);
                        break;
                    case 16:
                        intentt = new Intent(getApplicationContext(), res16.class);
                        break;
                    case 17:
                        intentt = new Intent(getApplicationContext(), res17.class);
                        break;
                    case 18:
                        intentt = new Intent(getApplicationContext(), res18.class);
                        break;
                    case 19:
                        intentt = new Intent(getApplicationContext(), res19.class);
                        break;
                    case 20:
                        intentt = new Intent(getApplicationContext(), res20.class);
                        break;
                    case 21:
                        intentt = new Intent(getApplicationContext(), res21.class);
                        break;
                    case 22:
                        intentt = new Intent(getApplicationContext(), res22.class);
                        break;
                    case 23:
                        intentt = new Intent(getApplicationContext(), res23.class);
                        break;
                }
                startActivity(intentt);
            }

        });



    }


}