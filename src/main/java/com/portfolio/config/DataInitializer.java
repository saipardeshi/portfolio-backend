package com.portfolio.config;

import com.portfolio.model.AdminUser;
import com.portfolio.model.Portfolio;
import com.portfolio.repository.AdminUserRepository;
import com.portfolio.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private AdminUserRepository adminUserRepository;

    @Autowired
    private PortfolioRepository portfolioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Value("${admin.username}")
    private String adminUsername;

    @Value("${admin.password}")
    private String adminPassword;

    @Override
    public void run(String... args) throws Exception {
        if (adminUserRepository.findByUsername(adminUsername).isEmpty()) {
            AdminUser admin = new AdminUser();
            admin.setUsername(adminUsername);
            admin.setPassword(passwordEncoder.encode(adminPassword));
            admin.setRole("ROLE_ADMIN");
            adminUserRepository.save(admin);
            System.out.println("Admin user created: " + adminUsername);
        }

        if (portfolioRepository.count() == 0) {
            Portfolio portfolio = createDefaultPortfolio();
            portfolioRepository.save(portfolio);
            System.out.println("Default portfolio data created");
        }
    }

    private Portfolio createDefaultPortfolio() {
        Portfolio p = new Portfolio();

        Portfolio.HeroSection hero = new Portfolio.HeroSection();
        hero.setName("Your Name");
        hero.setTagline("Full Stack Developer");
        hero.setShortIntro("I build elegant digital experiences.");
        hero.setProfilePhotoUrl("");
        hero.setLinkedinUrl("https://linkedin.com/in/yourusername");
        hero.setGithubUrl("https://github.com/yourusername");
        hero.setEmail("yourname@email.com");
        p.setHero(hero);

        Portfolio.AboutSection about = new Portfolio.AboutSection();
        about.setBio("I am a passionate Full Stack Developer.");
        about.setLocation("Pune, Maharashtra, India");
        about.setResumeUrl("#");
        /* ADDED: default stat values */
        about.setYearsExperience("3+");
        about.setProjectsCompleted("20+");
        about.setTechnologiesCount("10+");
        about.setCertificationsCount("5+");
        p.setAbout(about);

        Portfolio.SkillCategory frontend = new Portfolio.SkillCategory();
        frontend.setCategory("Frontend");
        frontend.setSkills(List.of("React.js", "JavaScript", "HTML5", "CSS3"));

        Portfolio.SkillCategory backend = new Portfolio.SkillCategory();
        backend.setCategory("Backend");
        backend.setSkills(List.of("Spring Boot", "Java", "MongoDB"));
        p.setSkills(List.of(frontend, backend));

        Portfolio.Experience exp = new Portfolio.Experience();
        exp.setCompany("Your Company");
        exp.setRole("Software Engineer");
        exp.setDuration("Jan 2022 - Present");
        exp.setDescription("Working on scalable applications.");
        exp.setTechStack(List.of("React", "Spring Boot", "MongoDB"));
        p.setExperiences(List.of(exp));

        Portfolio.Project proj = new Portfolio.Project();
        proj.setTitle("Portfolio Website");
        proj.setDescription("Full stack portfolio with admin panel.");
        proj.setGithubLink("https://github.com/yourusername/portfolio");
        proj.setLiveLink("#");
        proj.setTechStack(List.of("React", "Spring Boot", "MongoDB"));
        proj.setFeatured(true);
        p.setProjects(List.of(proj));

        Portfolio.Education edu = new Portfolio.Education();
        edu.setInstitution("Your University");
        edu.setDegree("Bachelor of Engineering");
        edu.setFieldOfStudy("Computer Engineering");
        edu.setDuration("2018 - 2022");
        edu.setGrade("8.5 CGPA");
        p.setEducations(List.of(edu));

        Portfolio.Certificate cert = new Portfolio.Certificate();
        cert.setTitle("AWS Certified Developer");
        cert.setIssuer("Amazon Web Services");
        cert.setDate("2023");
        cert.setCredentialUrl("#");
        p.setCertificates(List.of(cert));

        Portfolio.ContactInfo contact = new Portfolio.ContactInfo();
        contact.setEmail("yourname@email.com");
        contact.setPhone("+91 XXXXXXXXXX");
        contact.setLinkedinUrl("https://linkedin.com/in/yourusername");
        contact.setGithubUrl("https://github.com/yourusername");
        contact.setLocation("Pune, Maharashtra, India");
        p.setContact(contact);

        return p;
    }
}