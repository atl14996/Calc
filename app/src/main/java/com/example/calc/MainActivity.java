package com.example.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button decimal;
    private Button equals;
    private Button minus;
    private Button plus;
    private Button multiply;
    private Button divide;
    private Button sine;
    private Button cosine;
    private Button tangent;
    private Button naturallog;
    private Button logten;
    private Button euler;
    private Button inverse;
    private Button squareRoot;
    private Button exp;
    private Button pi;
    private Button clear;
    private TextView info;
    private TextView result;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char EQUALS = 0;
    private final char EXP = '^';
    private double input1 = Double.NaN;
    private double input2;
    private char ACTION;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getViews();

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "1");

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "0");
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + ".");
            }
        });

        exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = EXP;
                result.setText(String.valueOf(input1) + '^');
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = ADDITION;
                result.setText(String.valueOf(input1) + "+");
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = SUBTRACTION;
                result.setText(String.valueOf(input1) + "-");
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = MULTIPLICATION;
                result.setText(String.valueOf(input1) + "*");
                info.setText(null);
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = EQUALS;
                result.setText(result.getText().toString() + String.valueOf(input2)+  "=" + String.valueOf(input1) );
                info.setText(null);
            }
        });

divide.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        compute();
        ACTION = DIVISION;
        result.setText(String.valueOf(input1) + "/");
    }
});

exp.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        compute();
        ACTION = EXP;
        result.setText(String.valueOf(input1) + "^");

    }
});

euler.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        info.setText("2.71828");
    }
});

naturallog.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        result.setText(String.valueOf(Math.log(Double.parseDouble(result.toString()))));
    }
});

logten.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        result.setText(String.valueOf(Math.log10(Double.parseDouble(result.toString()))));
    }
});

squareRoot.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        result.setText(String.valueOf(Math.sqrt(Double.parseDouble(result.toString()))));
    }
});

pi.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        info.setText("3.1415926");
    }
});

inverse.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        result.setText(String.valueOf(1/Double.parseDouble(result.toString())));
    }
});

sine.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        result.setText(String.valueOf(Math.sin(Double.parseDouble(result.toString()))));
    }
});

cosine.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        result.setText(String.valueOf(Math.cos(Double.parseDouble(result.toString()))));
    }
});

tangent.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        result.setText(String.valueOf(Math.tan(Double.parseDouble(result.toString()))));
    }
});

clear.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(info.getText().length() > 0){
            CharSequence name = info.getText().toString();
            info.setText(name.subSequence(0, name.length()-1));
        }
        else{
            input1 = Double.NaN;
            input2 = Double.NaN;
            info.setText(null);
            result.setText(null);
        }
    }
});
    }

    private void getViews() {

        one = findViewById(R.id.onebutton);
        two = findViewById(R.id.twobutton);
        three = findViewById(R.id.threebutton);
        four = findViewById(R.id.fourbutton);
        five = findViewById(R.id.fivebutton);
        six = findViewById(R.id.sixbutton);
        seven = findViewById(R.id.sevenbutton);
        eight = findViewById(R.id.eightbutton);
        nine = findViewById(R.id.ninebutton);
        zero = findViewById(R.id.zerobutton);
        plus = findViewById(R.id.plusbutton);
        equals = findViewById(R.id.equalsbutton);
        minus = findViewById(R.id.minusbutton);
        exp = findViewById(R.id.expbutton);
        pi = findViewById(R.id.pibutton);
        divide = findViewById(R.id.divbutton);
        multiply = findViewById(R.id.multbutton);
        info = findViewById(R.id.textViewcontrol);
        result = findViewById(R.id.textViewdisplay);
        decimal = findViewById(R.id.decimalbutton);
        euler = findViewById(R.id.ebutton);
        naturallog = findViewById(R.id.naturallogbutton);
        logten = findViewById(R.id.logtenbutton);
        squareRoot = findViewById(R.id.squarerootbutton);
        sine = findViewById(R.id.sinebutton);
        cosine = findViewById(R.id.cosinebutton);
        tangent = findViewById(R.id.tangentbutton);
        inverse = findViewById(R.id.invbutton);
        clear = findViewById(R.id.clearbutton);


    }

    private void compute() {

        if (!Double.isNaN(input1)) {
            input2 = Double.parseDouble(info.getText().toString());

            switch (ACTION) {
                case ADDITION:
                    input1 = input1 + input2;
                    break;
                case SUBTRACTION:
                    input1 = input1 - input2;
                    break;
                case MULTIPLICATION:
                    input1 = input1 * input2;
                    break;
                case DIVISION:
                    input1 = input1 / input2;
                    break;
                case EXP:
                    input1 = Math.pow(input1,input2);
                case EQUALS:
                    break;
            }


        } else
            input1 = Double.parseDouble(info.getText().toString());
    }
}