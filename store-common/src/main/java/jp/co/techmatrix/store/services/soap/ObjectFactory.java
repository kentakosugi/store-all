
package jp.co.techmatrix.store.services.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jp.co.techmatrix.store.services.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddNewBookOperation_QNAME = new QName("http://soap.services.store.techmatrix.co.jp/", "addNewBookOperation");
    private final static QName _AddNewBookOperationResponse_QNAME = new QName("http://soap.services.store.techmatrix.co.jp/", "addNewBookOperationResponse");
    private final static QName _AddRegisterOperation_QNAME = new QName("http://soap.services.store.techmatrix.co.jp/", "addRegisterOperation");
    private final static QName _AddRegisterOperationResponse_QNAME = new QName("http://soap.services.store.techmatrix.co.jp/", "addRegisterOperationResponse");
    private final static QName _Book_QNAME = new QName("http://soap.services.store.techmatrix.co.jp/", "book");
    private final static QName _DeleteBookOperation_QNAME = new QName("http://soap.services.store.techmatrix.co.jp/", "deleteBookOperation");
    private final static QName _DeleteBookOperationResponse_QNAME = new QName("http://soap.services.store.techmatrix.co.jp/", "deleteBookOperationResponse");
    private final static QName _GetAllRegister_QNAME = new QName("http://soap.services.store.techmatrix.co.jp/", "getAllRegister");
    private final static QName _GetAllRegisterResponse_QNAME = new QName("http://soap.services.store.techmatrix.co.jp/", "getAllRegisterResponse");
    private final static QName _GetItemByIdOperation_QNAME = new QName("http://soap.services.store.techmatrix.co.jp/", "getItemByIdOperation");
    private final static QName _GetItemByIdOperationResponse_QNAME = new QName("http://soap.services.store.techmatrix.co.jp/", "getItemByIdOperationResponse");
    private final static QName _GetItemByTitleOperation_QNAME = new QName("http://soap.services.store.techmatrix.co.jp/", "getItemByTitleOperation");
    private final static QName _GetItemByTitleOperationResponse_QNAME = new QName("http://soap.services.store.techmatrix.co.jp/", "getItemByTitleOperationResponse");
    private final static QName _Login_QNAME = new QName("http://soap.services.store.techmatrix.co.jp/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://soap.services.store.techmatrix.co.jp/", "loginResponse");
    private final static QName _RemoveRegister_QNAME = new QName("http://soap.services.store.techmatrix.co.jp/", "removeRegister");
    private final static QName _RemoveRegisterResponse_QNAME = new QName("http://soap.services.store.techmatrix.co.jp/", "removeRegisterResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jp.co.techmatrix.store.services.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link AddNewBookOperation }
     * 
     */
    public AddNewBookOperation createAddNewBookOperation() {
        return new AddNewBookOperation();
    }

    /**
     * Create an instance of {@link AddNewBookOperationResponse }
     * 
     */
    public AddNewBookOperationResponse createAddNewBookOperationResponse() {
        return new AddNewBookOperationResponse();
    }

    /**
     * Create an instance of {@link AddRegisterOperation }
     * 
     */
    public AddRegisterOperation createAddRegisterOperation() {
        return new AddRegisterOperation();
    }

    /**
     * Create an instance of {@link AddRegisterOperationResponse }
     * 
     */
    public AddRegisterOperationResponse createAddRegisterOperationResponse() {
        return new AddRegisterOperationResponse();
    }

    /**
     * Create an instance of {@link DeleteBookOperation }
     * 
     */
    public DeleteBookOperation createDeleteBookOperation() {
        return new DeleteBookOperation();
    }

    /**
     * Create an instance of {@link DeleteBookOperationResponse }
     * 
     */
    public DeleteBookOperationResponse createDeleteBookOperationResponse() {
        return new DeleteBookOperationResponse();
    }

    /**
     * Create an instance of {@link GetAllRegister }
     * 
     */
    public GetAllRegister createGetAllRegister() {
        return new GetAllRegister();
    }

    /**
     * Create an instance of {@link GetAllRegisterResponse }
     * 
     */
    public GetAllRegisterResponse createGetAllRegisterResponse() {
        return new GetAllRegisterResponse();
    }

    /**
     * Create an instance of {@link GetItemByIdOperation }
     * 
     */
    public GetItemByIdOperation createGetItemByIdOperation() {
        return new GetItemByIdOperation();
    }

    /**
     * Create an instance of {@link GetItemByIdOperationResponse }
     * 
     */
    public GetItemByIdOperationResponse createGetItemByIdOperationResponse() {
        return new GetItemByIdOperationResponse();
    }

    /**
     * Create an instance of {@link GetItemByTitleOperation }
     * 
     */
    public GetItemByTitleOperation createGetItemByTitleOperation() {
        return new GetItemByTitleOperation();
    }

    /**
     * Create an instance of {@link GetItemByTitleOperationResponse }
     * 
     */
    public GetItemByTitleOperationResponse createGetItemByTitleOperationResponse() {
        return new GetItemByTitleOperationResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link RemoveRegister }
     * 
     */
    public RemoveRegister createRemoveRegister() {
        return new RemoveRegister();
    }

    /**
     * Create an instance of {@link RemoveRegisterResponse }
     * 
     */
    public RemoveRegisterResponse createRemoveRegisterResponse() {
        return new RemoveRegisterResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link OrderLine }
     * 
     */
    public OrderLine createOrderLine() {
        return new OrderLine();
    }

    /**
     * Create an instance of {@link Author }
     * 
     */
    public Author createAuthor() {
        return new Author();
    }

    /**
     * Create an instance of {@link Publisher }
     * 
     */
    public Publisher createPublisher() {
        return new Publisher();
    }

    /**
     * Create an instance of {@link Book.Authors }
     * 
     */
    public Book.Authors createBookAuthors() {
        return new Book.Authors();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewBookOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.store.techmatrix.co.jp/", name = "addNewBookOperation")
    public JAXBElement<AddNewBookOperation> createAddNewBookOperation(AddNewBookOperation value) {
        return new JAXBElement<AddNewBookOperation>(_AddNewBookOperation_QNAME, AddNewBookOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewBookOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.store.techmatrix.co.jp/", name = "addNewBookOperationResponse")
    public JAXBElement<AddNewBookOperationResponse> createAddNewBookOperationResponse(AddNewBookOperationResponse value) {
        return new JAXBElement<AddNewBookOperationResponse>(_AddNewBookOperationResponse_QNAME, AddNewBookOperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRegisterOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.store.techmatrix.co.jp/", name = "addRegisterOperation")
    public JAXBElement<AddRegisterOperation> createAddRegisterOperation(AddRegisterOperation value) {
        return new JAXBElement<AddRegisterOperation>(_AddRegisterOperation_QNAME, AddRegisterOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRegisterOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.store.techmatrix.co.jp/", name = "addRegisterOperationResponse")
    public JAXBElement<AddRegisterOperationResponse> createAddRegisterOperationResponse(AddRegisterOperationResponse value) {
        return new JAXBElement<AddRegisterOperationResponse>(_AddRegisterOperationResponse_QNAME, AddRegisterOperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Book }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.store.techmatrix.co.jp/", name = "book")
    public JAXBElement<Book> createBook(Book value) {
        return new JAXBElement<Book>(_Book_QNAME, Book.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBookOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.store.techmatrix.co.jp/", name = "deleteBookOperation")
    public JAXBElement<DeleteBookOperation> createDeleteBookOperation(DeleteBookOperation value) {
        return new JAXBElement<DeleteBookOperation>(_DeleteBookOperation_QNAME, DeleteBookOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBookOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.store.techmatrix.co.jp/", name = "deleteBookOperationResponse")
    public JAXBElement<DeleteBookOperationResponse> createDeleteBookOperationResponse(DeleteBookOperationResponse value) {
        return new JAXBElement<DeleteBookOperationResponse>(_DeleteBookOperationResponse_QNAME, DeleteBookOperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllRegister }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.store.techmatrix.co.jp/", name = "getAllRegister")
    public JAXBElement<GetAllRegister> createGetAllRegister(GetAllRegister value) {
        return new JAXBElement<GetAllRegister>(_GetAllRegister_QNAME, GetAllRegister.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllRegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.store.techmatrix.co.jp/", name = "getAllRegisterResponse")
    public JAXBElement<GetAllRegisterResponse> createGetAllRegisterResponse(GetAllRegisterResponse value) {
        return new JAXBElement<GetAllRegisterResponse>(_GetAllRegisterResponse_QNAME, GetAllRegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemByIdOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.store.techmatrix.co.jp/", name = "getItemByIdOperation")
    public JAXBElement<GetItemByIdOperation> createGetItemByIdOperation(GetItemByIdOperation value) {
        return new JAXBElement<GetItemByIdOperation>(_GetItemByIdOperation_QNAME, GetItemByIdOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemByIdOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.store.techmatrix.co.jp/", name = "getItemByIdOperationResponse")
    public JAXBElement<GetItemByIdOperationResponse> createGetItemByIdOperationResponse(GetItemByIdOperationResponse value) {
        return new JAXBElement<GetItemByIdOperationResponse>(_GetItemByIdOperationResponse_QNAME, GetItemByIdOperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemByTitleOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.store.techmatrix.co.jp/", name = "getItemByTitleOperation")
    public JAXBElement<GetItemByTitleOperation> createGetItemByTitleOperation(GetItemByTitleOperation value) {
        return new JAXBElement<GetItemByTitleOperation>(_GetItemByTitleOperation_QNAME, GetItemByTitleOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemByTitleOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.store.techmatrix.co.jp/", name = "getItemByTitleOperationResponse")
    public JAXBElement<GetItemByTitleOperationResponse> createGetItemByTitleOperationResponse(GetItemByTitleOperationResponse value) {
        return new JAXBElement<GetItemByTitleOperationResponse>(_GetItemByTitleOperationResponse_QNAME, GetItemByTitleOperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.store.techmatrix.co.jp/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.store.techmatrix.co.jp/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveRegister }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.store.techmatrix.co.jp/", name = "removeRegister")
    public JAXBElement<RemoveRegister> createRemoveRegister(RemoveRegister value) {
        return new JAXBElement<RemoveRegister>(_RemoveRegister_QNAME, RemoveRegister.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveRegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.services.store.techmatrix.co.jp/", name = "removeRegisterResponse")
    public JAXBElement<RemoveRegisterResponse> createRemoveRegisterResponse(RemoveRegisterResponse value) {
        return new JAXBElement<RemoveRegisterResponse>(_RemoveRegisterResponse_QNAME, RemoveRegisterResponse.class, null, value);
    }

}
