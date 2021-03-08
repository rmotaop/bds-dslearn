package com.devsuperior.dslearnbds.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_section")
public class Section {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String description;
	private Integer position;
	private String imgUri;
	
	@ManyToOne
	@JoinColumn(name = "resource_id")
	private Resource resource;
	
	@ManyToOne
	@JoinColumn(name = "prerequisite_id")
	private Section  prerequisite;
	
	public Section() {
		
	}

	public Section(Long id, String title, String description, Integer position, String imgUri, Resource resource,
			Section prerequisite) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.position = position;
		this.imgUri = imgUri;
		this.resource = resource;
		this.prerequisite = prerequisite;
	}

	private Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}

	private String getTitle() {
		return title;
	}

	private void setTitle(String title) {
		this.title = title;
	}

	private String getDescription() {
		return description;
	}

	private void setDescription(String description) {
		this.description = description;
	}

	private Integer getPosition() {
		return position;
	}

	private void setPosition(Integer position) {
		this.position = position;
	}

	private String getImgUri() {
		return imgUri;
	}

	private void setImgUri(String imgUri) {
		this.imgUri = imgUri;
	}

	private Resource getResource() {
		return resource;
	}

	private void setResource(Resource resource) {
		this.resource = resource;
	}

	private Section getPrerequisite() {
		return prerequisite;
	}

	private void setPrerequisite(Section prerequisite) {
		this.prerequisite = prerequisite;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Section other = (Section) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
