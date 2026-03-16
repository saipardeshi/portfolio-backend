package com.portfolio.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "portfolio")
public class Portfolio {

    @Id
    private String id;

    private HeroSection hero;
    private AboutSection about;
    private List<SkillCategory> skills;
    private List<Experience> experiences;
    private List<Project> projects;
    private List<Education> educations;
    private List<Certificate> certificates;
    private ContactInfo contact;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public HeroSection getHero() { return hero; }
    public void setHero(HeroSection hero) { this.hero = hero; }
    public AboutSection getAbout() { return about; }
    public void setAbout(AboutSection about) { this.about = about; }
    public List<SkillCategory> getSkills() { return skills; }
    public void setSkills(List<SkillCategory> skills) { this.skills = skills; }
    public List<Experience> getExperiences() { return experiences; }
    public void setExperiences(List<Experience> experiences) { this.experiences = experiences; }
    public List<Project> getProjects() { return projects; }
    public void setProjects(List<Project> projects) { this.projects = projects; }
    public List<Education> getEducations() { return educations; }
    public void setEducations(List<Education> educations) { this.educations = educations; }
    public List<Certificate> getCertificates() { return certificates; }
    public void setCertificates(List<Certificate> certificates) { this.certificates = certificates; }
    public ContactInfo getContact() { return contact; }
    public void setContact(ContactInfo contact) { this.contact = contact; }

    public static class HeroSection {
        private String name;
        private String tagline;
        private String shortIntro;
        private String profilePhotoUrl;
        private String linkedinUrl;
        private String githubUrl;
        private String email;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getTagline() { return tagline; }
        public void setTagline(String tagline) { this.tagline = tagline; }
        public String getShortIntro() { return shortIntro; }
        public void setShortIntro(String shortIntro) { this.shortIntro = shortIntro; }
        public String getProfilePhotoUrl() { return profilePhotoUrl; }
        public void setProfilePhotoUrl(String profilePhotoUrl) { this.profilePhotoUrl = profilePhotoUrl; }
        public String getLinkedinUrl() { return linkedinUrl; }
        public void setLinkedinUrl(String linkedinUrl) { this.linkedinUrl = linkedinUrl; }
        public String getGithubUrl() { return githubUrl; }
        public void setGithubUrl(String githubUrl) { this.githubUrl = githubUrl; }
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
    }

    public static class AboutSection {
        private String bio;
        private String location;
        private String resumeUrl;
        /* ADDED: stat fields for admin panel editing */
        private String yearsExperience = "3+";
        private String projectsCompleted = "20+";
        private String technologiesCount = "10+";
        private String certificationsCount = "5+";

        public String getBio() { return bio; }
        public void setBio(String bio) { this.bio = bio; }
        public String getLocation() { return location; }
        public void setLocation(String location) { this.location = location; }
        public String getResumeUrl() { return resumeUrl; }
        public void setResumeUrl(String resumeUrl) { this.resumeUrl = resumeUrl; }
        /* ADDED: getters and setters for stat fields */
        public String getYearsExperience() { return yearsExperience; }
        public void setYearsExperience(String yearsExperience) { this.yearsExperience = yearsExperience; }
        public String getProjectsCompleted() { return projectsCompleted; }
        public void setProjectsCompleted(String projectsCompleted) { this.projectsCompleted = projectsCompleted; }
        public String getTechnologiesCount() { return technologiesCount; }
        public void setTechnologiesCount(String technologiesCount) { this.technologiesCount = technologiesCount; }
        public String getCertificationsCount() { return certificationsCount; }
        public void setCertificationsCount(String certificationsCount) { this.certificationsCount = certificationsCount; }
    }

    public static class SkillCategory {
        private String category;
        private List<String> skills;

        public String getCategory() { return category; }
        public void setCategory(String category) { this.category = category; }
        public List<String> getSkills() { return skills; }
        public void setSkills(List<String> skills) { this.skills = skills; }
    }

    public static class Experience {
        private String company;
        private String role;
        private String duration;
        private String description;
        private String logoUrl;
        private List<String> techStack;

        public String getCompany() { return company; }
        public void setCompany(String company) { this.company = company; }
        public String getRole() { return role; }
        public void setRole(String role) { this.role = role; }
        public String getDuration() { return duration; }
        public void setDuration(String duration) { this.duration = duration; }
        public String getDescription() { return description; }
        public void setDescription(String description) { this.description = description; }
        public String getLogoUrl() { return logoUrl; }
        public void setLogoUrl(String logoUrl) { this.logoUrl = logoUrl; }
        public List<String> getTechStack() { return techStack; }
        public void setTechStack(List<String> techStack) { this.techStack = techStack; }
    }

    public static class Project {
        private String title;
        private String description;
        private String imageUrl;
        private String githubLink;
        private String liveLink;
        private List<String> techStack;
        private boolean featured;

        public String getTitle() { return title; }
        public void setTitle(String title) { this.title = title; }
        public String getDescription() { return description; }
        public void setDescription(String description) { this.description = description; }
        public String getImageUrl() { return imageUrl; }
        public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
        public String getGithubLink() { return githubLink; }
        public void setGithubLink(String githubLink) { this.githubLink = githubLink; }
        public String getLiveLink() { return liveLink; }
        public void setLiveLink(String liveLink) { this.liveLink = liveLink; }
        public List<String> getTechStack() { return techStack; }
        public void setTechStack(List<String> techStack) { this.techStack = techStack; }
        public boolean isFeatured() { return featured; }
        public void setFeatured(boolean featured) { this.featured = featured; }
    }

    public static class Education {
        private String institution;
        private String degree;
        private String fieldOfStudy;
        private String duration;
        private String grade;

        public String getInstitution() { return institution; }
        public void setInstitution(String institution) { this.institution = institution; }
        public String getDegree() { return degree; }
        public void setDegree(String degree) { this.degree = degree; }
        public String getFieldOfStudy() { return fieldOfStudy; }
        public void setFieldOfStudy(String fieldOfStudy) { this.fieldOfStudy = fieldOfStudy; }
        public String getDuration() { return duration; }
        public void setDuration(String duration) { this.duration = duration; }
        public String getGrade() { return grade; }
        public void setGrade(String grade) { this.grade = grade; }
    }

    public static class Certificate {
        private String title;
        private String issuer;
        private String date;
        private String credentialUrl;
        private String imageUrl;

        public String getTitle() { return title; }
        public void setTitle(String title) { this.title = title; }
        public String getIssuer() { return issuer; }
        public void setIssuer(String issuer) { this.issuer = issuer; }
        public String getDate() { return date; }
        public void setDate(String date) { this.date = date; }
        public String getCredentialUrl() { return credentialUrl; }
        public void setCredentialUrl(String credentialUrl) { this.credentialUrl = credentialUrl; }
        public String getImageUrl() { return imageUrl; }
        public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
    }

    public static class ContactInfo {
        private String email;
        private String phone;
        private String linkedinUrl;
        private String githubUrl;
        private String location;

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
        public String getPhone() { return phone; }
        public void setPhone(String phone) { this.phone = phone; }
        public String getLinkedinUrl() { return linkedinUrl; }
        public void setLinkedinUrl(String linkedinUrl) { this.linkedinUrl = linkedinUrl; }
        public String getGithubUrl() { return githubUrl; }
        public void setGithubUrl(String githubUrl) { this.githubUrl = githubUrl; }
        public String getLocation() { return location; }
        public void setLocation(String location) { this.location = location; }
    }
}