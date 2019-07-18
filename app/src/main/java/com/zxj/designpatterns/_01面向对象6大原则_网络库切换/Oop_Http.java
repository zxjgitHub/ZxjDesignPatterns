package com.zxj.designpatterns._01面向对象6大原则_网络库切换;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zxj.designpatterns.R;


public class Oop_Http extends AppCompatActivity {
    /**
     * 1.单一责任原则：对功能进行分类，代码进行解耦
     * 栗子：网络库缓存类，配置类，请求类必须分开写,不能写在一起
     *
     *2.里氏替换原则：在继承类时,除了拓展一些新功能,尽量不要删除或者修改对父类的方法引用,也尽量不要重载父类的方法
     * 栗子：每个类都是Object的子类,Object有个toString(),假如子类重写了返回null,在个子类的下一级继承者都返回null
     *
     *3.依赖倒置：高层次模块不依赖低层次模块的细节，高层次就是不依赖细节而依赖抽象（不依赖具体的类,而是依赖接口）
     *栗子：加载图片功能,可以使用流行的当前图片加载库，也可以自己写,这时候需要去是定义接口,交给各自实现类
     *
     *4.接口隔离：类不应该依赖他不需要的接口,一个类对一个类的继承应该建立在最小的接口上，接口功能要单一，避免臃肿
     *栗子：A类,B类，实现了C接口，但是A,B都有不同的功能，这时候需要C接口进行功能拆分，让A,B实现各自所需功能
     *
     *5.迪米特法则:一个对象应该对其他对象保持最少的了解，这样才能做到最大的解耦程度
     * 栗子：在封装SDK时,开发者只需要为使用者提供一些外部调用接口，调用者只知其他调用的功能，并不知道具体的实现
     *
     * 6.开闭原则：类，模块和函数应该对扩展开发，对修改关闭
     * 栗子：一个类或者一个模块整个生命周期，因为迭代，维护需要对原来的代码进行修改,很有可能对其引入错误
     * 有时候不得已需要重构，因此最好不要修改，而进行接口拓展
     *
     *
     * 总结：如何去遵循这个这6个原则，对这六个原则的遵守并不是是和否的问题，而是程度多少，我们并不会刻意遵守,任何东西过犹不及，应该结合当时场景，灵活使用！
     *
     *
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oop__http);
    }
}
