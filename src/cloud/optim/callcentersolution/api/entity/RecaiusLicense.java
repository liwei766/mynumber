/**
 * Copyright (C) 2017 OPTiM Corp. All Rights Reserved
 * システム名：
 * ソースファイル名：RecaiusLicense.java
 */

package cloud.optim.callcentersolution.api.entity;
// Generated by Hibernate Tools 3.2.2.CR1


import java.util.Date;

/**

 */
public class RecaiusLicense  implements java.io.Serializable {


	/**
	 * リカイアスライセンス ID
	 */
	private Long recaiusLicenseId;

	/**
	 * 更新日時
	 */
	private Date updateDate;

	/**
	 * サービス利用ID
	 */
	private String serviceId;

	/**
	 * パスワード
	 */
	private String password;

	/**
	 * 代理店企業ID
	 */
	private String agencyCompanyId;

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
	 * RecaiusLicense デフォルトコンストラクター
	 */
	public RecaiusLicense() {
	}

	/**
	 * RecaiusLicense 最小コンストラクター
	 * @param serviceId サービス利用ID
	 * @param password パスワード
	 * @param createDate 作成日時
	 * @param createUserId 作成ユーザ ID
	 * @param createUserName 作成ユーザ名
	 * @param updateUserId 更新ユーザ ID
	 * @param updateUserName 更新ユーザ名
	 */
	public RecaiusLicense(String serviceId, String password, Date createDate, String createUserId, String createUserName, String updateUserId, String updateUserName) {
		this.serviceId = serviceId;
		this.password = password;
		this.createDate = createDate;
		this.createUserId = createUserId;
		this.createUserName = createUserName;
		this.updateUserId = updateUserId;
		this.updateUserName = updateUserName;
    }
	/**
	 * RecaiusLicense フルコンストラクター
	 * @param serviceId サービス利用ID
	 * @param password パスワード
	 * @param agencyCompanyId 代理店企業ID
	 * @param createDate 作成日時
	 * @param createUserId 作成ユーザ ID
	 * @param createUserName 作成ユーザ名
	 * @param updateUserId 更新ユーザ ID
	 * @param updateUserName 更新ユーザ名
	 */
	public RecaiusLicense(String serviceId, String password, String agencyCompanyId, Date createDate, String createUserId, String createUserName, String updateUserId, String updateUserName) {
		this.serviceId = serviceId;
		this.password = password;
		this.agencyCompanyId = agencyCompanyId;
		this.createDate = createDate;
		this.createUserId = createUserId;
		this.createUserName = createUserName;
		this.updateUserId = updateUserId;
		this.updateUserName = updateUserName;
	}

	// * リカイアスライセンス ID */
	/**
	 * @return recaiusLicenseId (リカイアスライセンス ID)
	 */
	public Long getRecaiusLicenseId() {
		return this.recaiusLicenseId;
	}

	/**
	 * @param recaiusLicenseId リカイアスライセンス ID
	 */
	public void setRecaiusLicenseId(Long recaiusLicenseId) {
		this.recaiusLicenseId = recaiusLicenseId;
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

	// * サービス利用ID */
	/**
	 * @return serviceId (サービス利用ID)
	 */
	public String getServiceId() {
		return this.serviceId;
	}

	/**
	 * @param serviceId サービス利用ID
	 */
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	// * パスワード */
	/**
	 * @return password (パスワード)
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * @param password パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	// * 代理店企業ID */
	/**
	 * @return agencyCompanyId (代理店企業ID)
	 */
	public String getAgencyCompanyId() {
		return this.agencyCompanyId;
	}

	/**
	 * @param agencyCompanyId 代理店企業ID
	 */
	public void setAgencyCompanyId(String agencyCompanyId) {
		this.agencyCompanyId = agencyCompanyId;
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
		buffer.append("recaiusLicenseId").append("='").append(getRecaiusLicenseId()).append("' ");
		buffer.append("updateDate").append("='").append(getUpdateDate()).append("' ");
		buffer.append("serviceId").append("='").append(getServiceId()).append("' ");
		buffer.append("agencyCompanyId").append("='").append(getAgencyCompanyId()).append("' ");
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
		if ( !(other instanceof RecaiusLicense) ) return false;
		RecaiusLicense castOther = ( RecaiusLicense ) other;

		return ( (this.getRecaiusLicenseId()==castOther.getRecaiusLicenseId()) || ( this.getRecaiusLicenseId()!=null && castOther.getRecaiusLicenseId()!=null && this.getRecaiusLicenseId().equals(castOther.getRecaiusLicenseId()) ) )
 && ( (this.getUpdateDate()==castOther.getUpdateDate()) || ( this.getUpdateDate()!=null && castOther.getUpdateDate()!=null && this.getUpdateDate().equals(castOther.getUpdateDate()) ) )
 && ( (this.getServiceId()==castOther.getServiceId()) || ( this.getServiceId()!=null && castOther.getServiceId()!=null && this.getServiceId().equals(castOther.getServiceId()) ) )
 && ( (this.getPassword()==castOther.getPassword()) || ( this.getPassword()!=null && castOther.getPassword()!=null && this.getPassword().equals(castOther.getPassword()) ) )
 && ( (this.getAgencyCompanyId()==castOther.getAgencyCompanyId()) || ( this.getAgencyCompanyId()!=null && castOther.getAgencyCompanyId()!=null && this.getAgencyCompanyId().equals(castOther.getAgencyCompanyId()) ) )
 && ( (this.getCreateDate()==castOther.getCreateDate()) || ( this.getCreateDate()!=null && castOther.getCreateDate()!=null && this.getCreateDate().equals(castOther.getCreateDate()) ) )
 && ( (this.getCreateUserId()==castOther.getCreateUserId()) || ( this.getCreateUserId()!=null && castOther.getCreateUserId()!=null && this.getCreateUserId().equals(castOther.getCreateUserId()) ) )
 && ( (this.getCreateUserName()==castOther.getCreateUserName()) || ( this.getCreateUserName()!=null && castOther.getCreateUserName()!=null && this.getCreateUserName().equals(castOther.getCreateUserName()) ) )
 && ( (this.getUpdateUserId()==castOther.getUpdateUserId()) || ( this.getUpdateUserId()!=null && castOther.getUpdateUserId()!=null && this.getUpdateUserId().equals(castOther.getUpdateUserId()) ) )
 && ( (this.getUpdateUserName()==castOther.getUpdateUserName()) || ( this.getUpdateUserName()!=null && castOther.getUpdateUserName()!=null && this.getUpdateUserName().equals(castOther.getUpdateUserName()) ) );
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + ( getRecaiusLicenseId() == null ? 0 : this.getRecaiusLicenseId().hashCode() );
		result = 37 * result + ( getUpdateDate() == null ? 0 : this.getUpdateDate().hashCode() );
		result = 37 * result + ( getServiceId() == null ? 0 : this.getServiceId().hashCode() );
		result = 37 * result + ( getPassword() == null ? 0 : this.getPassword().hashCode() );
		result = 37 * result + ( getAgencyCompanyId() == null ? 0 : this.getAgencyCompanyId().hashCode() );
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


