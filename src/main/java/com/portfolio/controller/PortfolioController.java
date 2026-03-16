package com.portfolio.controller;

import com.portfolio.model.Portfolio;
import com.portfolio.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class PortfolioController {

    @Autowired
    private PortfolioService portfolioService;

    @GetMapping("/api/portfolio")
    public ResponseEntity<?> getPortfolio() {
        return portfolioService.getPortfolio()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/api/admin/portfolio/hero")
    public ResponseEntity<Portfolio> updateHero(@RequestBody Portfolio.HeroSection hero) {
        return ResponseEntity.ok(portfolioService.updateHero(hero));
    }

    @PutMapping("/api/admin/portfolio/about")
    public ResponseEntity<Portfolio> updateAbout(@RequestBody Portfolio.AboutSection about) {
        return ResponseEntity.ok(portfolioService.updateAbout(about));
    }

    @PutMapping("/api/admin/portfolio/skills")
    public ResponseEntity<Portfolio> updateSkills(@RequestBody List<Portfolio.SkillCategory> skills) {
        return ResponseEntity.ok(portfolioService.updateSkills(skills));
    }

    @PutMapping("/api/admin/portfolio/experiences")
    public ResponseEntity<Portfolio> updateExperiences(@RequestBody List<Portfolio.Experience> experiences) {
        return ResponseEntity.ok(portfolioService.updateExperiences(experiences));
    }

    @PutMapping("/api/admin/portfolio/projects")
    public ResponseEntity<Portfolio> updateProjects(@RequestBody List<Portfolio.Project> projects) {
        return ResponseEntity.ok(portfolioService.updateProjects(projects));
    }

    @PutMapping("/api/admin/portfolio/educations")
    public ResponseEntity<Portfolio> updateEducations(@RequestBody List<Portfolio.Education> educations) {
        return ResponseEntity.ok(portfolioService.updateEducations(educations));
    }

    @PutMapping("/api/admin/portfolio/certificates")
    public ResponseEntity<Portfolio> updateCertificates(@RequestBody List<Portfolio.Certificate> certs) {
        return ResponseEntity.ok(portfolioService.updateCertificates(certs));
    }

    @PutMapping("/api/admin/portfolio/contact")
    public ResponseEntity<Portfolio> updateContact(@RequestBody Portfolio.ContactInfo contact) {
        return ResponseEntity.ok(portfolioService.updateContact(contact));
    }
}