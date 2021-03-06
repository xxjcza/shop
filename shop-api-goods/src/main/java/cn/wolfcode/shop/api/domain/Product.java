package cn.wolfcode.shop.api.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Product implements Serializable
{
    private Long id;

    private Date createdDate;

    private Date lastModifiedDate;

    private Integer version;

    private Long catalogId;

    private Long brandId;

    private String name;

    private String keyword;

    private String code;

    private String image;

    private BigDecimal marketPrice;

    private BigDecimal basePrice;

    private Long mods;

    private String impressions;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Date getCreatedDate()
    {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate)
    {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate()
    {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate)
    {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Integer getVersion()
    {
        return version;
    }

    public void setVersion(Integer version)
    {
        this.version = version;
    }

    public Long getCatalogId()
    {
        return catalogId;
    }

    public void setCatalogId(Long catalogId)
    {
        this.catalogId = catalogId;
    }

    public Long getBrandId()
    {
        return brandId;
    }

    public void setBrandId(Long brandId)
    {
        this.brandId = brandId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getKeyword()
    {
        return keyword;
    }

    public void setKeyword(String keyword)
    {
        this.keyword = keyword;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getImage()
    {
        return image;
    }

    public void setImage(String image)
    {
        this.image = image;
    }

    public BigDecimal getMarketPrice()
    {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice)
    {
        this.marketPrice = marketPrice;
    }

    public BigDecimal getBasePrice()
    {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice)
    {
        this.basePrice = basePrice;
    }

    public Long getMods()
    {
        return mods;
    }

    public void setMods(Long mods)
    {
        this.mods = mods;
    }

    public String getImpressions()
    {
        return impressions;
    }

    public void setImpressions(String impressions)
    {
        this.impressions = impressions;
    }
}