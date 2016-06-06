DELETE FROM AUTHOR;
DELETE FROM BOOK;
DELETE FROM PUBLISHER;

INSERT INTO AUTHOR VALUES (1, '4798140929', '寺田 佳央');
INSERT INTO AUTHOR VALUES (2, '4798140929', '猪瀬 淳');
INSERT INTO AUTHOR VALUES (3, '4798140929','藤田 益嗣');
INSERT INTO AUTHOR VALUES (4, '4798140929','羽生田 恒永');
INSERT INTO AUTHOR VALUES (5, '4798140929', '梶浦 美咲');
INSERT INTO AUTHOR VALUES (6, '4621066056', 'Joshua Bloch');
INSERT INTO AUTHOR VALUES (7, '4873114675', 'Bill Burke');
INSERT INTO AUTHOR VALUES (8, '4873114675', 'arton');
INSERT INTO AUTHOR VALUES (9, '4873114780', 'Peter B. MacIntyre');
INSERT INTO AUTHOR VALUES (10, '4873110912', 'Ben Albahari');
INSERT INTO AUTHOR VALUES (11, '4873110912', 'Peter Drayton');
INSERT INTO AUTHOR VALUES (12, '4873110912', 'Brad Merrill');
INSERT INTO AUTHOR VALUES (13, '4798144029', '山田 祥寛');
INSERT INTO AUTHOR VALUES (14, '4873114047', '吉岡 弘隆');
INSERT INTO AUTHOR VALUES (15, '4873114047', '大和 一洋');
INSERT INTO AUTHOR VALUES (16, '4873114047', '大岩 尚宏');
INSERT INTO AUTHOR VALUES (17, '4873114047', '安部 東洋');
INSERT INTO AUTHOR VALUES (18, '4873114047', '吉田 俊輔');

INSERT INTO PUBLISHER VALUES (1, '翔泳社');
INSERT INTO PUBLISHER VALUES (2, '丸善出版');
INSERT INTO PUBLISHER VALUES (3, 'オライリージャパン');

INSERT INTO BOOK VALUES (
1,
'Javaによる業務システム開発向けの標準仕様であるJava EE。本書は、フレームワークとしての基盤機能が一層充実したJava EE 7の基本と実践的な開発方法を学ぶための書籍です。Javaの基本文法を身につけた方を対象に、プレゼンテーション層の開発機能JSFやビジネスロジック層の開発機能CDI/EJB、データアクセス層の開発機能JPAなど、業務システム開発時に必要不可欠な機能群の使い方や活用方法を、具体的なサンプルを交えて詳しく解説します。Java EE 7で追加されたWebサービスやバッチ処理の機能についてもカバーしています。これからJava EE開発を始める方、Java EEの機能をもっと使いこなしたい方など、業務システム開発に携わるJavaエンジニアにおすすめの一冊です。',
'4798140929',
3800,
30,
'Java EE 7徹底入門 標準Javaフレームワークによる高信頼性Webシステムの構築',
'2015/12/16',
1
);
INSERT INTO BOOK VALUES (
2,
'著者が、グーグル社やサンマイクロシステムズ社におけるソフトウェア開発で得た知識・経験をまとめたJavaプログラミングの定本。Javaでプログラミングをするすべてのエンジニア必読の書。',
'4621066056',
3600,
20,
'EFFECTIVE JAVA 第2版 (The Java Series)',
'2008/11/01',
2
);
INSERT INTO BOOK VALUES (
3,
'Java EE 6でサポートされたJAX-RSの特徴とRESTfulアーキテクチャ原則を使って、Javaでの分散Webサービスを設計開発する方法を学ぶ書籍。理論よりも実装に焦点を当て、RESTのアーキテクチャから実装までを豊富なサンプルコードとともに解説します。前半では、URIの決定方法、HTTPコンテンツネゴシエーション、HATEOASなどRESTとJAX-RSの概要について解説し、後半のワークブックでは、前半の技術解説で取り上げた設定、実行などを例題と共に学習します。JAX-RS仕様の解説と具体的な利用例からなる本書を読むことで、Javaの新しいデザイン手法であるアノテーションやインジェクションなどについても自然と学ぶことができるでしょう。柔軟なAPIを提供するJAX-RSを題材にRESTについて学べる本書は、Javaの最新動向を学習したいプログラマ／設計者必携の一冊です。',
'4873114675',
3456,
1,
'JavaによるRESTfulシステム構築',
'2010/08/01',
3
);
INSERT INTO BOOK VALUES(
4,
'本書は、PHPの最も便利な機能を取り上げて詳しく解説し、さらに、どうすればウェブ開発のプロセスをスピードアップできるのか、よく利用されるPHPのエレメントが誤って実装されてしまうことがあるのはなぜなのか、どんな「パーツ」がオブジェクト指向プログラミングに適するのかといった実際的な問題の理由を解き明かします。PHPの初学者から他の言語で開発経験のある開発者まで、幅広い読者を対象としており、基本項目を軸にしてていねいに解説。手早くPHPについての理解を深めることができます。プロフェッショナルな開発者にとっては、既存の知識やテクニックを棚卸しして、新鮮な視点を取り入れるきっかけとして役立つでしょう。',
'4873114780',
1944,
35,
'PHP: The Good Parts',
'2010/12/01',
3
);
INSERT INTO BOOK VALUES(
5,
'C#言語は、Microsoft .NETプラットフォームでさまざまなアプリケーションを開発するのに適したオブジェクト指向言語です。また、C#で開発するためには、そのプラッ トフォームである.NET Frameworkは欠かせません。本書では、そのC#言語の要素をなす文法上の特徴や.NET Frameworkを用いたプログラミング、主な.NET Frameworkのクラスライブラリをコンパクトに解説しています。C#に興味のある方やこれからC#を使ってみたいという方に最適な1冊です。また、C#はどのような言語かを知りたい方も、本書を覗いてみるといいかもしれません。',
'4873110912',
2808,
3,
'C# エッセンシャルズ 第2版',
'2002/07/01',
3
);
INSERT INTO BOOK VALUES(
6,
'ASP.NET入門書が最新の技術に対応し、ますますパワーアップ! Visual Studio/ASP.NETによるWebプログラミングの標準教科書『独習ASP.NET』が最新のVisual Studio 2015/ASP.Net 4.6に対応。Visual StudioでWebアプリケーション・Webフォームを開発する際に必要となる、基礎的な知識やASP.NETの仕組みから、サーバーコントロールの使い方と使い分け、データベース連携、状態管理、Ajax/jQueryまで、詳細かつ丁寧に解説しています。また、今回の改訂では、新たにASP.NET Identityの実装や、オープンソースのBootstrapとの連携といった機能の解説を追加しています。本書は解説、練習問題、理解度チェックという3つのステップで、Webアプリケーション開発の基礎・基本テクニックをしっかりと習得することができます。実際にサンプルコードを入力し、動作を確認しながら学習することで、いっそう理解が深めることができます。本番環境としては、従来から使用されているInternet Information Servicesだけでなく、Microsoft Azure上でも動作させられる手順を紹介しています。ASP.NETを一からしっかり学びたいという方にオススメの一冊です。',
'4798144029',
3800,
2,
'独習ASP.NET 第5版',
'2016/01/22',
1
);
INSERT INTO BOOK VALUES(
7,
'ミラクル・リナックス株式会社の精鋭エンジニアたちが、長年のLinuxカーネル開発の経験で培ったデバッグテクニックを詳解。こころがまえから、準備、必要な知識、バグの原因をすばやく特定し修正するために必要なテクニックとツール、高度なデバッグ技まで惜しみなく披露します。多くの事例に基づいた実際的実用的な技が満載です。',
'4873114047',
3456,
10,
'Debug Hacks -デバッグを極めるテクニック&ツール',
'2009/04/27',
3
);

