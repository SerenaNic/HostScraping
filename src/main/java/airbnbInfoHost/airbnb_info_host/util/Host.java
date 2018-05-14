package airbnbInfoHost.airbnb_info_host.util;

import java.util.LinkedList;

public class Host {

	private String name;
	private String city;
	private String membershipDate;
	private boolean superhost;
	private boolean verified;
	private String description;
	private LinkedList<String> linkedAccountVerified;
	private String schoolInfo;
	private String jobInfo;
	private int reviewNumber;
	private int guideNumber;
	private int whishListNumber;

	public Host() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMembershipDate() {
		return membershipDate;
	}
	public void setMembershipDate(String membershipDate) {
		this.membershipDate = membershipDate;
	}
	public boolean isSuperhost() {
		return superhost;
	}
	public void setSuperhost(boolean superhost) {
		this.superhost = superhost;
	}
	public boolean isVerified() {
		return verified;
	}
	public void setVerified(boolean verified) {
		this.verified = verified;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getSchoolInfo() {
		return schoolInfo;
	}
	public void setSchoolInfo(String schoolInfo) {
		this.schoolInfo = schoolInfo;
	}
	public String getJobInfo() {
		return jobInfo;
	}
	public void setJobInfo(String jobInfo) {
		this.jobInfo = jobInfo;
	}
	public int getReviewNumber() {
		return reviewNumber;
	}
	public void setReviewNumber(int reviewNumber) {
		this.reviewNumber = reviewNumber;
	}
	public int getGuideNumber() {
		return guideNumber;
	}
	public void setGuideNumber(int guideNumber) {
		this.guideNumber = guideNumber;
	}
	public int getWhishListNumber() {
		return whishListNumber;
	}
	public void setWhishListNumber(int whishListNumber) {
		this.whishListNumber = whishListNumber;
	}
	
	public LinkedList<String> getLinkedAccountVerified() {
		return linkedAccountVerified;
	}
	public void setLinkedAccountVerified(LinkedList<String> linkedAccountVerified) {
		this.linkedAccountVerified = linkedAccountVerified;
	}
	@Override
	public String toString() {
		return "Host [name=" + name + ", city=" + city + ", membershipDate=" + membershipDate + ", superhost="
				+ superhost + ", verified=" + verified + ", description=" + description + ", linkedAccountVerified=("
				+ linkedAccountVerified.toString() + "), schoolInfo=" + schoolInfo + ", jobInfo=" + jobInfo + ", reviewNumber="
				+ reviewNumber + ", guideNumber=" + guideNumber + ", whishListNumber=" + whishListNumber + "]";
	}


}