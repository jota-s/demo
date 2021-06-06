package com.cmmn;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.util.Assert;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Getter
@Entity
public class ComUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userNo;
	
	@Column
	private String userId;

	@Column
	private String userNm;
	
	@Column
	private String userPw;
	
	@Column
	private char userRole;
	
	@Column
	private String photo;
	
	@Column
	private int deptNo;
	
	@Column
	private char deleteFlag;

	@Builder
	public ComUser(int userNo, String userId, String userNm, String userPw, char userRole, String photo, int deptNo,
			char deleteFlag) {
		Assert.hasText(userId, "userId must not be empty");
		
		this.userNo = userNo;
		this.userId = userId;
		this.userNm = userNm;
		this.userPw = userPw;
		this.userRole = userRole;
		this.photo = photo;
		this.deptNo = deptNo;
		this.deleteFlag = deleteFlag;
	}
	
	
	
}
