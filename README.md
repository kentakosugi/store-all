# README

## 本プロジェクトの構成
```java
 + store-all ・・・ 親プロジェクト
 | ├ store-backend ・・・ REST-APIやSOAPの役割を担う。war。
 | ├ store-front・・・・・store-backendを呼び出すフロント部分の役割。war。
 | ├ store-common・・・・すべてのプロジェクトで利用するようなUtil系のクラスを格納。front/backend両方から参照する。jar。
 | └ store-maintenace・・・メンテナンス用Web画面
 └ pom.xml
```

## 利用テクノロジ
* PrimeFaces(JSF)
* JPA(EclipseLink)
* JAX-RS
* JAX-WS
* EJB
* JAXB
* CDI
* Servlet
* BeanValidation

JSPはJtest10.Xで解析できないため使用していません。