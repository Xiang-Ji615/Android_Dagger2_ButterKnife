package com.example.xiangji.jjbutterknife.dagger2;

import com.example.xiangji.jjbutterknife.common.CoffeeMachine;
import com.example.xiangji.jjbutterknife.common.ICoffeeMachine;

import dagger.Module;
import dagger.Provides;

/**
 * Created by XiangJi on 5/12/2017.
 */

@Module
public class SimpleModule {

    @Provides
    @A
    CoffeeMachine provideCoffeeMachine(){
        return new CoffeeMachine();
    }
}
