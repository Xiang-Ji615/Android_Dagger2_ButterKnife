package com.example.xiangji.jjbutterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.xiangji.jjbutterknife.common.CoffeeMachine;
import com.example.xiangji.jjbutterknife.dagger2.DaggerSimpleComponent;
import com.example.xiangji.jjbutterknife.dagger2.SimpleComponent;
import com.example.xiangji.jjbutterknife.dagger2.SimpleModule;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tvCoffee)
    TextView tvConffee;

    @BindView(R.id.btnMakeCoffee)
    Button btnMakeCoffee;

    @Inject
    CoffeeMachine coffeeMachine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        btnMakeCoffee.setText("JJ Btn Text Changed");
        SimpleComponent simpleComponent = DaggerSimpleComponent.builder().simpleModule(new SimpleModule()).build();
        simpleComponent.inject(this);

    }

    public void btnMakeCoffeeClick(View v){
        System.out.println("Make coffee btn clicked");
        System.out.println(coffeeMachine.makeCoffee());
    }
}
