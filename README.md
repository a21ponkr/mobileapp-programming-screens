
I made a second activity called SecondActivity and in there is a textview. And in MainActivity you see
a button which lets the user jump from the main activity into the second activity. However you can't jump
from second to main. In the Second Activity you also see some Data, here you are shown the first prime number, which is 2.

```
public void newActivity(View v)
{
Intent intent = new Intent(this, SecondActivity.class);
intent.putExtra("first_prime_number", "2");
startActivity(intent);
}
```

And in Second Activity the data will be displayed as:

```
        Intent intent = getIntent();
        String prime_number = intent.getStringExtra("first_prime_number");
        TextView tvPrime_number = findViewById(R.id.txt_first_prime_number);
        tvPrime_number.setText(prime_number);
```

![](Screenshot_20220502-074058.png)
![](Screenshot_20220502-074103.png)