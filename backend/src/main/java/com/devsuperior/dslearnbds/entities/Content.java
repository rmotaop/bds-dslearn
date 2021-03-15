package com.devsuperior.dslearnbds.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_content")
<<<<<<< HEAD
public class Content extends Lesson {
	private static final long serialVersionUID = 1L;

=======
public class Content extends Lesson{
	private static final long serialVersionUID = 1L;
	
>>>>>>> 66eb500588bb12ceaf389bfd784a0c1d3d93cd81
	private String textContent;
	private String videoUri;
	
	public Content() {
<<<<<<< HEAD
=======
				
>>>>>>> 66eb500588bb12ceaf389bfd784a0c1d3d93cd81
	}

	public Content(Long id, String title, Integer position, Section section, String textContent, String videoUri) {
		super(id, title, position, section);
		this.textContent = textContent;
		this.videoUri = videoUri;
	}

	public String getTextContent() {
		return textContent;
	}

	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}

	public String getVideoUri() {
		return videoUri;
	}

	public void setVideoUri(String videoUri) {
		this.videoUri = videoUri;
	}
<<<<<<< HEAD
=======
	
	
	

>>>>>>> 66eb500588bb12ceaf389bfd784a0c1d3d93cd81
}
