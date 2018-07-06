/**
 * Copyright (C) 2017 OPTiM Corp. All Rights Reserved
 * システム名：
 * ソースファイル名：Reference.java
 */

package cloud.optim.callcentersolution.api.entity;
// Generated by Hibernate Tools 3.2.2.CR1


import java.util.Date;

/**

 */
public class Reference  implements java.io.Serializable {


	/**
	 * 参照先ID
	 */
	private Long referenceId;

	/**
	 * 更新日時
	 */
	private Date updateDate;

	/**
	 * 企業 ID
	 */
	private String companyId;

	/**
	 * ナレッジ ID
	 */
	private Long knowledgeId;

	/**
	 * 参照先URL
	 */
	private String referenceUrl;

	/**
	 * 作成日時
	 */
	private Date createDate;

	/**
	 * 作成ユーザ ID
	 */
	private String createUserId;

	/**
	 * 作成ユーザ名
	 */
	private String createUserName;

	/**
	 * 更新ユーザ ID
	 */
	private String updateUserId;

	/**
	 * 更新ユーザ名
	 */
	private String updateUserName;


	/**
	 * Reference デフォルトコンストラクター
	 */
	public Reference() {
	}

	/**
	 * Reference 最小コンストラクター
	 * @param companyId 企業 ID
	 * @param knowledgeId ナレッジ ID
	 * @param createDate 作成日時
	 * @param createUserId 作成ユーザ ID
	 * @param createUserName 作成ユーザ名
	 * @param updateUserId 更新ユーザ ID
	 * @param updateUserName 更新ユーザ名
	 */
	public Reference(String companyId, Long knowledgeId, Date createDate, String createUserId, String createUserName, String updateUserId, String updateUserName) {
		this.companyId = companyId;
		this.knowledgeId = knowledgeId;
		this.createDate = createDate;
		this.createUserId = createUserId;
		this.createUserName = createUserName;
		this.updateUserId = updateUserId;
		this.updateUserName = updateUserName;
    }
	/**
	 * Reference フルコンストラクター
	 * @param companyId 企業 ID
	 * @param knowledgeId ナレッジ ID
	 * @param referenceUrl 参照先URL
	 * @param createDate 作成日時
	 * @param createUserId 作成ユーザ ID
	 * @param createUserName 作成ユーザ名
	 * @param updateUserId 更新ユーザ ID
	 * @param updateUserName 更新ユーザ名
	 */
	public Reference(String companyId, Long knowledgeId, String referenceUrl, Date createDate, String createUserId, String createUserName, String updateUserId, String updateUserName) {
		this.companyId = companyId;
		this.knowledgeId = knowledgeId;
		this.referenceUrl = referenceUrl;
		this.createDate = createDate;
		this.createUserId = createUserId;
		this.createUserName = createUserName;
		this.updateUserId = updateUserId;
		this.updateUserName = updateUserName;
	}

	// * 参照先ID */
	/**
	 * @return referenceId (参照先ID)
	 */
	public Long getReferenceId() {
		return this.referenceId;
	}

	/**
	 * @param referenceId 参照先ID
	 */
	public void setReferenceId(Long referenceId) {
		this.referenceId = referenceId;
	}

	// * 更新日時 */
	/**
	 * @return updateDate (更新日時)
	 */
	public Date getUpdateDate() {
		return this.updateDate;
	}

	/**
	 * @param updateDate 更新日時
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	// * 企業 ID */
	/**
	 * @return companyId (企業 ID)
	 */
	public String getCompanyId() {
		return this.companyId;
	}

	/**
	 * @param companyId 企業 ID
	 */
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	// * ナレッジ ID */
	/**
	 * @return knowledgeId (ナレッジ ID)
	 */
	public Long getKnowledgeId() {
		return this.knowledgeId;
	}

	/**
	 * @param knowledgeId ナレッジ ID
	 */
	public void setKnowledgeId(Long knowledgeId) {
		this.knowledgeId = knowledgeId;
	}

	// * 参照先URL */
	/**
	 * @return referenceUrl (参照先URL)
	 */
	public String getReferenceUrl() {
		return this.referenceUrl;
	}

	/**
	 * @param referenceUrl 参照先URL
	 */
	public void setReferenceUrl(String referenceUrl) {
		this.referenceUrl = referenceUrl;
	}

	// * 作成日時 */
	/**
	 * @return createDate (作成日時)
	 */
	public Date getCreateDate() {
		return this.createDate;
	}

	/**
	 * @param createDate 作成日時
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	// * 作成ユーザ ID */
	/**
	 * @return createUserId (作成ユーザ ID)
	 */
	public String getCreateUserId() {
		return this.createUserId;
	}

	/**
	 * @param createUserId 作成ユーザ ID
	 */
	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	// * 作成ユーザ名 */
	/**
	 * @return createUserName (作成ユーザ名)
	 */
	public String getCreateUserName() {
		return this.createUserName;
	}

	/**
	 * @param createUserName 作成ユーザ名
	 */
	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}

	// * 更新ユーザ ID */
	/**
	 * @return updateUserId (更新ユーザ ID)
	 */
	public String getUpdateUserId() {
		return this.updateUserId;
	}

	/**
	 * @param updateUserId 更新ユーザ ID
	 */
	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}

	// * 更新ユーザ名 */
	/**
	 * @return updateUserName (更新ユーザ名)
	 */
	public String getUpdateUserName() {
		return this.updateUserName;
	}

	/**
	 * @param updateUserName 更新ユーザ名
	 */
	public void setUpdateUserName(String updateUserName) {
		this.updateUserName = updateUserName;
	}


	/**
	 * toString
	 * @return String
	*/
	public String toString() {
		StringBuffer buffer = new StringBuffer();

		buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
		buffer.append("referenceId").append("='").append(getReferenceId()).append("' ");
		buffer.append("updateDate").append("='").append(getUpdateDate()).append("' ");
		buffer.append("companyId").append("='").append(getCompanyId()).append("' ");
		buffer.append("knowledgeId").append("='").append(getKnowledgeId()).append("' ");
		buffer.append("referenceUrl").append("='").append(getReferenceUrl()).append("' ");
		buffer.append("createDate").append("='").append(getCreateDate()).append("' ");
		buffer.append("createUserId").append("='").append(getCreateUserId()).append("' ");
		buffer.append("updateUserId").append("='").append(getUpdateUserId()).append("' ");
		buffer.append("]");

		return buffer.toString();
	}

	@Override
	public boolean equals(Object other) {
		if ( (this == other ) ) return true;
		if ( (other == null ) ) return false;
		if ( !(other instanceof Reference) ) return false;
		Reference castOther = ( Reference ) other;

		return ( (this.getReferenceId()==castOther.getReferenceId()) || ( this.getReferenceId()!=null && castOther.getReferenceId()!=null && this.getReferenceId().equals(castOther.getReferenceId()) ) )
 && ( (this.getUpdateDate()==castOther.getUpdateDate()) || ( this.getUpdateDate()!=null && castOther.getUpdateDate()!=null && this.getUpdateDate().equals(castOther.getUpdateDate()) ) )
 && ( (this.getCompanyId()==castOther.getCompanyId()) || ( this.getCompanyId()!=null && castOther.getCompanyId()!=null && this.getCompanyId().equals(castOther.getCompanyId()) ) )
 && ( (this.getKnowledgeId()==castOther.getKnowledgeId()) || ( this.getKnowledgeId()!=null && castOther.getKnowledgeId()!=null && this.getKnowledgeId().equals(castOther.getKnowledgeId()) ) )
 && ( (this.getReferenceUrl()==castOther.getReferenceUrl()) || ( this.getReferenceUrl()!=null && castOther.getReferenceUrl()!=null && this.getReferenceUrl().equals(castOther.getReferenceUrl()) ) )
 && ( (this.getCreateDate()==castOther.getCreateDate()) || ( this.getCreateDate()!=null && castOther.getCreateDate()!=null && this.getCreateDate().equals(castOther.getCreateDate()) ) )
 && ( (this.getCreateUserId()==castOther.getCreateUserId()) || ( this.getCreateUserId()!=null && castOther.getCreateUserId()!=null && this.getCreateUserId().equals(castOther.getCreateUserId()) ) )
 && ( (this.getCreateUserName()==castOther.getCreateUserName()) || ( this.getCreateUserName()!=null && castOther.getCreateUserName()!=null && this.getCreateUserName().equals(castOther.getCreateUserName()) ) )
 && ( (this.getUpdateUserId()==castOther.getUpdateUserId()) || ( this.getUpdateUserId()!=null && castOther.getUpdateUserId()!=null && this.getUpdateUserId().equals(castOther.getUpdateUserId()) ) )
 && ( (this.getUpdateUserName()==castOther.getUpdateUserName()) || ( this.getUpdateUserName()!=null && castOther.getUpdateUserName()!=null && this.getUpdateUserName().equals(castOther.getUpdateUserName()) ) );
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + ( getReferenceId() == null ? 0 : this.getReferenceId().hashCode() );
		result = 37 * result + ( getUpdateDate() == null ? 0 : this.getUpdateDate().hashCode() );
		result = 37 * result + ( getCompanyId() == null ? 0 : this.getCompanyId().hashCode() );
		result = 37 * result + ( getKnowledgeId() == null ? 0 : this.getKnowledgeId().hashCode() );
		result = 37 * result + ( getReferenceUrl() == null ? 0 : this.getReferenceUrl().hashCode() );
		result = 37 * result + ( getCreateDate() == null ? 0 : this.getCreateDate().hashCode() );
		result = 37 * result + ( getCreateUserId() == null ? 0 : this.getCreateUserId().hashCode() );
		result = 37 * result + ( getCreateUserName() == null ? 0 : this.getCreateUserName().hashCode() );
		result = 37 * result + ( getUpdateUserId() == null ? 0 : this.getUpdateUserId().hashCode() );
		result = 37 * result + ( getUpdateUserName() == null ? 0 : this.getUpdateUserName().hashCode() );
		return result;
	}

  // The following is extra code specified in the hbm.xml files

	/** serialVersionUID  */
	private static final long serialVersionUID = 1L;
		
  // end of extra code specified in the hbm.xml files

}

