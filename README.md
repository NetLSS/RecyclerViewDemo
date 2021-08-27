# RecyclerViewDemo
Android RecyclerView, CardView Demo project

## screenshot

![img](https://i.imgur.com/CLHZfYo.png)

## 앱바, 컬랩싱 툴바 레이아웃 사용 (코디네이트 레이아웃과 함께)

```xml
    <
    app:layout_behavior="@string/appbar_scrolling_view_behavior">
```

```xml
        <androidx.appcompat.widget.Toolbar
            ...
            app:layout_scrollFlags="scroll|enterAlways"/>
```

![mp4](https://i.imgur.com/A8HcJDu.mp4)