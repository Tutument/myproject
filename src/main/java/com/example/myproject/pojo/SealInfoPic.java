package com.example.myproject.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "t_seal_info_pic")
public class  SealInfoPic {
	/**
	 * 主键
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * 印章图像数据
	 */
	@Lob
	private String pic_compress;

	/**
	 * 印章编码
	 */
	@Column(length = 40)
	private String seal_code;

	private Integer pic_status;

	public Integer getPic_status() {
		return pic_status;
	}

	public void setPic_status(Integer pic_status) {
		this.pic_status = pic_status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPic_compress() {
		return pic_compress;
	}

	public void setPic_compress(String pic_compress) {
		this.pic_compress = pic_compress;
	}

	public String getSeal_code() {
		return seal_code;
	}

	public void setSeal_code(String seal_code) {
		this.seal_code = seal_code;
	}
}
