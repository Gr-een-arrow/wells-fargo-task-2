package com.wellsfargo.counselor.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Portfolio{
    @Id
    @GeneratedValue()
    private Long portfolioId;

    @OneToOne
    @JoinColumn(name="clientId")
    private Client client;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Security> securities;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Date createdTime;

    @Column(nullable = false)
    private Date lastUpdated;

    protected Portfolio(){

    }

    public Portfolio(Client client, String name, Date createdTime, Date lastUpdated){
        this.client = client;
        this.name = name;
        this.createdTime = createdTime;
        this.lastUpdated = lastUpdated;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}