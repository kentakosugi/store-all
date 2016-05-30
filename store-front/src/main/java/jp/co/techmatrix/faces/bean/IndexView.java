package jp.co.techmatrix.faces.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.event.SelectEvent;
import org.primefaces.model.tagcloud.DefaultTagCloudItem;
import org.primefaces.model.tagcloud.DefaultTagCloudModel;
import org.primefaces.model.tagcloud.TagCloudItem;
import org.primefaces.model.tagcloud.TagCloudModel;

import jp.co.techmatrix.store.services.soap.Book;

/**
 * index.xhtmlと紐づけられたManged Bean
 * 
 * @author kosugi
 *
 */
@Named
@SessionScoped
public class IndexView implements Serializable{

	/**
	 * SerialUID
	 */
	private static final long serialVersionUID = 4074875063668482695L;

	private List<Book> books;

	private List<String> images;

	private TagCloudModel model;

	/**
	 * 本の一覧を設定します。
	 * @param books 設定する本
	 */
	public void setBooks(List<Book> books){
		this.books = books;
	}

	/**
	 * 本の一覧を取得します。
	 * @return
	 */
	public List<Book> getBooks(){
		return this.books;
	}

	/**
	 * 初期化処理
	 */
	@PostConstruct
	public void init(){
		this.images = new ArrayList<String>();
		for(int i = 1; i <= 5; i++){
			this.images.add(i + ".jpg");
		}

		this.model = new DefaultTagCloudModel();
		this.model.addTag(new DefaultTagCloudItem("Transformers", 1));
		this.model.addTag(new DefaultTagCloudItem("RIA", "#", 3));
		this.model.addTag(new DefaultTagCloudItem("AJAX", 2));
		this.model.addTag(new DefaultTagCloudItem("jQuery", "#", 5));
		this.model.addTag(new DefaultTagCloudItem("NextGen", 4));
		this.model.addTag(new DefaultTagCloudItem("JSF 2.0", "#", 2));
		this.model.addTag(new DefaultTagCloudItem("FCB", 5));
		this.model.addTag(new DefaultTagCloudItem("Mobile", 3));
		this.model.addTag(new DefaultTagCloudItem("Themes", "#", 4));
		this.model.addTag(new DefaultTagCloudItem("Rocks", "#", 1));
	}

	/**
	 * Imageの取得
	 * @return
	 */
	public List<String> getImages(){
		return this.images;
	}

	/**
	 * TagCloudModelを取得します。
	 * @return
	 */
	public TagCloudModel getModel(){
		return this.model;
	}

	/**
	 * 選択された際にコールバックされるメソッド
	 * @param event
	 */
	public void onSelect(SelectEvent event){
		TagCloudItem item = (TagCloudItem)event.getObject();
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item Selected", item.getLabel());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
}
