# Book Sınıfı
Bu Java projesi, Book sınıfını tanımlar ve bu sınıf üzerinde bazı işlemleri gerçekleştirir.

## Book Sınıfı
### Özellikler
- title: Kitabın adını temsil eden bir String.
- pageCount: Kitabın sayfa sayısını temsil eden bir tamsayı (int).
- author: Kitabın yazarını temsil eden bir String.
- publicationDate: Kitabın yayın tarihini temsil eden bir String.
### Metodlar
- Constructor: Book sınıfının yapıcı metodudur. title, pageCount, author ve publicationDate parametrelerini alır ve ilgili özelliklere değer atar.
- getTitle(): Kitabın adını döndürür.
- getPageCount(): Kitabın sayfa sayısını döndürür.
- getAuthor(): Kitabın yazarını döndürür.
- getPublicationDate(): Kitabın yayın tarihini döndürür.
- compareTo(): Comparable arayüzünden miras alınan bu metod, kitapları isimlerine göre sıralamak için kullanılır.
- toString(): Book sınıfını temsil eden bir dize (String) döndürür.
### Kullanım
Book sınıfının örneklendirilmesi ve işlemlerin gerçekleştirilmesi için aşağıdaki adımları takip edebilirsiniz:

1. Book sınıfını indirin ve projenize ekleyin.
2. Main metodu içerisinde, Book nesneleri oluşturun ve bu nesneleri Set tipinde bir veri yapısında saklayın.
3. İlgili Set yapısını oluştururken, isme göre sıralama için TreeSet sınıfını kullanın ve compareTo metodunu override edin.
4. İkinci bir Set yapısı oluşturarak, kitapları sayfa sayısına göre sıralayın ve bu yapının elemanlarını yazdırın.

Örnek kodu çalıştırdığınızda, kitapların isme göre sıralandığı ve sayfa sayısına göre sıralandığı sonuçları göreceksiniz.