package ru.avalon.java.dev.j110.labs.person;

import ru.avalon.java.dev.j110.labs.data.Text;
import ru.avalon.java.dev.j110.labs.data.Date;
import ru.avalon.java.dev.j110.labs.data.Number;

/**
 * @author Nikolai Shilenko
 *
 */
public class Man {
	private Text surname;
	private Text firstname;
	private Text patronymic;
	private Date date;
	protected Number document;
	
	protected Man() {
		this(null, null, null, null, null);
	}
	
	protected Man(Text surname, Text firstname, Text patronymic) {
		this(surname, firstname, patronymic, null, null);
	}
	
	protected Man(Text surname, Text firstname, Text patronymic, Date date, Number document) {
		this.surname = surname;
		this.firstname = firstname;
		this.patronymic = patronymic;
		this.date = date;
		this.document = document;
	}
	
	public void setDocument(Number document) {
		this.document = document;
		System.out.println("Man:setDocument()");
	}
	
	public final void setDate(Date date) {
		this.date = date;
		System.out.println("Man:setDate()");
	}
}
