package ru.avalon.java.dev.j110.labs.student;

import ru.avalon.java.dev.j110.labs.data.Date;
import ru.avalon.java.dev.j110.labs.data.Number;
import ru.avalon.java.dev.j110.labs.data.Text;
import ru.avalon.java.dev.j110.labs.person.Man;

/**
 * @author Nikolai Shilenko
 *
 */
public final class Student extends Man {
	private Number gradebook;
	
	public Student() {
		super();
	}
	
	public Student(Text surname, Text firstname, Text patronymic) {
		super(surname, firstname, patronymic);
	}

	public Student(Text surname, Text firstname, Text patronymic, Date date, Number document, Number gradebook) {
		super(surname, firstname, patronymic, date, document);
		this.gradebook = gradebook;
	}

	@Override
	public void setDocument(Number document) {
		this.document = document;
		System.out.println("Student:setDocument()");
	}
}
