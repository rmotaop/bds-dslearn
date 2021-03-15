package com.devsuperior.dslearnbds.entities.pk;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.devsuperior.dslearnbds.entities.Offer;
import com.devsuperior.dslearnbds.entities.User;

@Embeddable
public class EnrollmentPK implements Serializable {
	private static final long serialVersionUID = 1L;
<<<<<<< HEAD

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

=======
	
	
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
>>>>>>> 66eb500588bb12ceaf389bfd784a0c1d3d93cd81
	@ManyToOne
	@JoinColumn(name = "offer_id")
	private Offer offer;
	
<<<<<<< HEAD
	public EnrollmentPK() {
	}

=======

	public EnrollmentPK() {
		
	}


>>>>>>> 66eb500588bb12ceaf389bfd784a0c1d3d93cd81
	public EnrollmentPK(User user, Offer offer) {
		super();
		this.user = user;
		this.offer = offer;
	}

<<<<<<< HEAD
=======

>>>>>>> 66eb500588bb12ceaf389bfd784a0c1d3d93cd81
	public User getUser() {
		return user;
	}

<<<<<<< HEAD
=======

>>>>>>> 66eb500588bb12ceaf389bfd784a0c1d3d93cd81
	public void setUser(User user) {
		this.user = user;
	}

<<<<<<< HEAD
=======

>>>>>>> 66eb500588bb12ceaf389bfd784a0c1d3d93cd81
	public Offer getOffer() {
		return offer;
	}

<<<<<<< HEAD
=======

>>>>>>> 66eb500588bb12ceaf389bfd784a0c1d3d93cd81
	public void setOffer(Offer offer) {
		this.offer = offer;
	}

<<<<<<< HEAD
=======

>>>>>>> 66eb500588bb12ceaf389bfd784a0c1d3d93cd81
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((offer == null) ? 0 : offer.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

<<<<<<< HEAD
=======

>>>>>>> 66eb500588bb12ceaf389bfd784a0c1d3d93cd81
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EnrollmentPK other = (EnrollmentPK) obj;
		if (offer == null) {
			if (other.offer != null)
				return false;
		} else if (!offer.equals(other.offer))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
<<<<<<< HEAD
=======
	
	
	
>>>>>>> 66eb500588bb12ceaf389bfd784a0c1d3d93cd81
}
