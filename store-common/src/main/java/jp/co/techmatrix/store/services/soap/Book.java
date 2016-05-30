
package jp.co.techmatrix.store.services.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>book complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="book"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authors" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="authors" type="{http://soap.services.store.techmatrix.co.jp/}author" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="isbn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="publisher" type="{http://soap.services.store.techmatrix.co.jp/}publisher" minOccurs="0"/&gt;
 *         &lt;element name="stock" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "book", propOrder = {
    "authors",
    "description",
    "id",
    "isbn",
    "price",
    "publisher",
    "stock",
    "title",
    "year"
})
public class Book {

    protected Book.Authors authors;
    protected String description;
    protected int id;
    protected String isbn;
    protected double price;
    protected Publisher publisher;
    protected int stock;
    protected String title;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar year;

    /**
     * authorsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Book.Authors }
     *     
     */
    public Book.Authors getAuthors() {
        return authors;
    }

    /**
     * authorsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Book.Authors }
     *     
     */
    public void setAuthors(Book.Authors value) {
        this.authors = value;
    }

    /**
     * descriptionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * descriptionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * idプロパティの値を取得します。
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * idプロパティの値を設定します。
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * isbnプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * isbnプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsbn(String value) {
        this.isbn = value;
    }

    /**
     * priceプロパティの値を取得します。
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * priceプロパティの値を設定します。
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * publisherプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Publisher }
     *     
     */
    public Publisher getPublisher() {
        return publisher;
    }

    /**
     * publisherプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Publisher }
     *     
     */
    public void setPublisher(Publisher value) {
        this.publisher = value;
    }

    /**
     * stockプロパティの値を取得します。
     * 
     */
    public int getStock() {
        return stock;
    }

    /**
     * stockプロパティの値を設定します。
     * 
     */
    public void setStock(int value) {
        this.stock = value;
    }

    /**
     * titleプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * titleプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * yearプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYear() {
        return year;
    }

    /**
     * yearプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYear(XMLGregorianCalendar value) {
        this.year = value;
    }


    /**
     * <p>anonymous complex typeのJavaクラス。
     * 
     * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="authors" type="{http://soap.services.store.techmatrix.co.jp/}author" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "authors"
    })
    public static class Authors {

        protected List<Author> authors;

        /**
         * Gets the value of the authors property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the authors property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAuthors().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Author }
         * 
         * 
         */
        public List<Author> getAuthors() {
            if (authors == null) {
                authors = new ArrayList<Author>();
            }
            return this.authors;
        }

    }

}
