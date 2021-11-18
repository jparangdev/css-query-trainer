package kr.co.the32devs.cssquerytrainer.biz.questions.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import kr.co.the32devs.cssquerytrainer.common.enums.YNCode;
import lombok.Getter;

@Entity
@Getter
public class Question {
	@Id
	@GeneratedValue
	private Long id;

	private int level;

	@Lob
	private String text;

	private LocalDateTime createAt;

	private LocalDateTime updateAt;

	@Enumerated(EnumType.STRING)
	private YNCode delYn;
}
