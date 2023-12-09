# Button-Paneli
Button Kontrol Paneli Uygulaması
-

4x4 bir düğme düzeni oluşturuluyor ve her düğmeye "Button 1", "Button 2", ... şeklinde adlar atanıyor. Her düğmeye ayrıca "https://api.example.com/graphql" gibi bir GraphQL şema atanıyor. 
Bir JFrame oluşturuluyor ve bu frame'in özellikleri ayarlanıyor.
Döngü içinde oluşturulan düğmeler frame'e ekleniyor.
Frame'in boyutu ayarlanıp, görünür hale getiriliyor.
Düğmelere tıklandığında, ilgili olaylar tetiklenir ve konsola bağlı GraphQL şema yazdırılır.
Her buton başta pasif olarak başlatıldı.Hangilerine dokunursanda pasiflikten çıkıp aktiflige geçiyor tıklanan düğmenin bağlı olduğu GraphQL şeması konsola yazdırılır ve rengide birlikte degişti.
Eger aktif olmuş  olan butona tekrar tıklarsanda diger aktif olmuş olan 
butonlar pasiflige geçer ve sadece tıkladıgın aktif kalır( tıklanan düğmenin bağlı olduğu  GraphQL şeması konsola yazdırılır ).Ama tekrar pasif olanlara tıklarsan olaylar devam eder,
bir sorun olmadan tekrardan farklı tıkladıkların butonlar aktif olur.(Aktif olmuş olan 
butona tıklamadıgın zamana kadar pasif olan hangisine tıklarsan olaylar devame eder.)

KODU NASIL TEST EDEBİLİRİZ
-
Pencereyi açtığınızda, bir kontrol paneli ile 4x4 düğme düzenini içeren bir arayüz görmelisiniz.
Her düğmenin, oluşturulduğu sırada atanmış olan "https://api.example.com/graphql" gibi bir GraphQL şemasına sahip olduğunu doğrulayın.
Her buton sarı ve 'pasif'yazısı yazmalıdır.
Bir butona tıkladıgınızda sarıdan pembe rengine dönmeli ve 'pasif' yerine 'aktif' yazmalıdır.
Diger bir kontrol testi ise butonlardan birkaçına tıkladıkdan sonra tekrar tıklanmış bir aktif butona tıklayıp diger butonların nasıl güncellendigine bakarsınız.
Eger aktif olan butona tekrar tıkladıktan sonra diger aktif olanların pasife dönüp sadece 2.defa tıklanmış butonun aktif olarak kalması gerekiyor.Tabi aynı zamanda renklerininde
dogru çalışması gerek.


GRAPQL NEDİR?
-

GraphQL, API'ler için açık kaynaklı bir veri sorgulama ve işleme dili ve bu sorguları yerine getirmek için yazılmış uygulamalardır.
GraphQL, 2012'de Facebook tarafından dahili olarak geliştirildi ve 2015'te herkese açık olarak yayınlandı.
GraphQL projesi 7 Kasım 2018'de, Facebook'tan kâr amacı gütmeyen Linux Vakfı bünyesindeki yeni kurulan GraphQL Vakfı'na devredildi.
2012'den bu yana GraphQL'in yükselişi, GraphQL'in yaratıcısı Lee Byron tarafından belirlenen benimseme zaman çizelgesini yakından takip etti.
Byron'ın amacı, GraphQL'yi web platformlarında her yerde mevcut hale getirmektir.


GRAPQL NE İŞE YARAR?
-

GraphQL projesinde bir şema belirlenir. İstemci bu şemaya bağlı kalarak sorgularını yönetir.
1.İstemci sadece kendisine gerekli olan verileri alır.
2.Sayfa oluşum hızına büyük katkı sağlar.
3.İlişkili datalar arasında dilediğinde kendisi bağlayıcı rolü olabilir.
4.RestAPI’lere tek bir endpoint ile erişim sağlar.
Örn :
Bir listeleme işlemi yaptığımızı düşünelim. “Order” diye bir tablomuz, bu tabloya bağlı 25 adet property var.
Biz sipariş listesi sayfasımız için REST API ile “order/getlist” adında bir servis yazdık ve sayfaya bu verileri gönderebiliyoruz.

Gösterim yaparken sadece “id, totalPrice” versini gösteriyoruz diyelim. Diğer propertylerin sayfada her hangi bir işlevi yokken onların servisten bana 
json olarak dönmesi benim sayfa render hızımı etkileyecektir.

Bu yüzden GraphQL sorgusu ile sadece “id,totalPrice” değerlerinin servisten gelmesini sağlayabilirim.

GraphAPI altyapısındaki terimleri kısaca bir tanıyalım;
-
Types: Veri Aktarım Nesneleri
Queries: Sorgular
Mutations: Değişikliğe Sebep Olan Eylemler
Subscriptions: Abonelikler
Resolvers: İstek Karşılayıcılar

GRAPHQL SAĞLADIGI FAYDALAR
-

Müşterinin tam olarak hangi verilere ihtiyaç duyduğunu belirlemesini sağlar.
Birden çok kaynaktan veri toplamayı kolaylaştırır.
Verileri açıklamak için bir tür sistemi kullanır.
REST API'lerinde bulunmayan özellikler sunmak için birçok açık kaynaklı GraphQL uzantısı mevcuttur.
GraphQL, bir uygulama API'sinin mevcut sorguları bozmadan gelişmesine izin verir.
Kesin olarak tanımlanmış veri türleri, istemci ile sunucu arasındaki yanlış iletişimi azaltır.
GraphQL çağrıları tek bir gidiş-dönüş yolculuğunda ele alınır. Müşteriler, istediklerini, aşırı yükleme olmadan alırlar.
