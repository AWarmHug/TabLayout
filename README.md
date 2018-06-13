

# TabLayout

在原design包中的TabLayout的基础上增加了一些属性。

主要是下方横线：

1. 设置下方横线宽度：固定宽度（xxdp），和文字等宽，和图标等宽，和自定义等宽，
2. 设置下方横线离底部的距离，
3. 设置字体大小

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
```

Width是和Equal冲突的，如果设置了具体的宽度，那么Equal就无效了，

tabTextSize/tabSelectedTextSize和selectedTextColor用法相同，

会覆盖掉tabTextAppearance已经设置好的效果，

已经发布到jitpack上：

```
repositories {
    jcenter()
    maven { url "https://jitpack.io" }
    google()
}
```

```
implementation('com.github.AWarmHug:TabLayout:1.0.2') {
    exclude group: 'com.android.support'
}
```

效果如图：

![image](image/tablayout.gif)