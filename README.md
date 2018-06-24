

# TabLayout

在原design包中的TabLayout的基础上增加了一些属性。

主要是下方横线：

1. 设置下方横线宽度：固定宽度（xxdp），和文字等宽，和图标等宽，和自定义等宽，
2. 设置下方横线离底部的距离，
3. 设置字体大小
4. 设置绘制形状：矩形和圆角矩形
5. 设置拉伸值，0<=stretch<1 (如果设置0就是没有拉伸和原效果相同)

具体可以查看res/values/attrs

```
<attr name="tabIndicatorEqual" format="enum">
    <enum name="equalToTab" value="-1" />
    <enum name="equalToText" value="-2" />
    <enum name="equalToIcon" value="-3" />
    <enum name="equalToCustom" value="-4" />
</attr>
<attr name="tabIndicatorWidth" format="dimension" />
<attr name="tabIndicatorBottom" format="dimension" />

<attr name="tabTextSize" format="dimension" />
<attr name="tabSelectedTextSize" format="dimension" />

<attr name="tabIndicatorShape" format="enum">
    <enum name="rect" value="0" />
    enum name="roundRect" value="1" />
</attr>
<attr name="tabIndicatorStretch" format="float" />
```

Width是和Equal冲突的，如果设置了具体的宽度，那么Equal就无效了，

tabTextSize/tabSelectedTextSize和selectedTextColor用法相同，

会覆盖掉tabTextAppearance已经设置好的效果，

Stretch为0-1(不包含1)，如果值越大拉伸效果越明显，

已经发布到jitpack上：

```
repositories {
    jcenter()
    maven { url "https://jitpack.io" }
    google()
}
```

```
implementation('com.github.AWarmHug:TabLayout:x.y.z') {
    exclude group: 'com.android.support'
}
```

效果如图：

![image](image/tablayout.gif)