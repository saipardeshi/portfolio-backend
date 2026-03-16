package com.portfolio.service;

import com.portfolio.model.Portfolio;
import com.portfolio.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PortfolioService {

    @Autowired
    private PortfolioRepository portfolioRepository;

    public Optional<Portfolio> getPortfolio() {
        List<Portfolio> portfolios = portfolioRepository.findAll();
        return portfolios.isEmpty() ? Optional.empty() : Optional.of(portfolios.get(0));
    }

    public Portfolio savePortfolio(Portfolio portfolio) {
        return portfolioRepository.save(portfolio);
    }

    public Portfolio updateHero(Portfolio.HeroSection hero) {
        Portfolio portfolio = getPortfolio().orElseThrow();
        portfolio.setHero(hero);
        return portfolioRepository.save(portfolio);
    }

    public Portfolio updateAbout(Portfolio.AboutSection about) {
        Portfolio portfolio = getPortfolio().orElseThrow();
        portfolio.setAbout(about);
        return portfolioRepository.save(portfolio);
    }

    public Portfolio updateSkills(List<Portfolio.SkillCategory> skills) {
        Portfolio portfolio = getPortfolio().orElseThrow();
        portfolio.setSkills(skills);
        return portfolioRepository.save(portfolio);
    }

    public Portfolio updateExperiences(List<Portfolio.Experience> experiences) {
        Portfolio portfolio = getPortfolio().orElseThrow();
        portfolio.setExperiences(experiences);
        return portfolioRepository.save(portfolio);
    }

    public Portfolio updateProjects(List<Portfolio.Project> projects) {
        Portfolio portfolio = getPortfolio().orElseThrow();
        portfolio.setProjects(projects);
        return portfolioRepository.save(portfolio);
    }

    public Portfolio updateEducations(List<Portfolio.Education> educations) {
        Portfolio portfolio = getPortfolio().orElseThrow();
        portfolio.setEducations(educations);
        return portfolioRepository.save(portfolio);
    }

    public Portfolio updateCertificates(List<Portfolio.Certificate> certificates) {
        Portfolio portfolio = getPortfolio().orElseThrow();
        portfolio.setCertificates(certificates);
        return portfolioRepository.save(portfolio);
    }

    public Portfolio updateContact(Portfolio.ContactInfo contact) {
        Portfolio portfolio = getPortfolio().orElseThrow();
        portfolio.setContact(contact);
        return portfolioRepository.save(portfolio);
    }
}