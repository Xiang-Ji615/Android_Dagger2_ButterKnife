package com.example.xiangji.jjbutterknife.dagger2;

import com.example.xiangji.jjbutterknife.MainActivity;

import dagger.Component;

/**
 * Created by XiangJi on 5/12/2017.
 */

@Component(modules = SimpleModule.class)
public interface SimpleComponent {
     void inject(MainActivity mainActivity);
}
