package org.linlinjava.litemall.db.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class LitemallShop {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_shop.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_shop.industry_classify
     *
     * @mbg.generated
     */
    private Integer[] industryClassify;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_shop.region
     *
     * @mbg.generated
     */
    private String region;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_shop.shop_facility
     *
     * @mbg.generated
     */
    private Integer[] shopFacility;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_shop.address
     *
     * @mbg.generated
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_shop.url
     *
     * @mbg.generated
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_shop.shopname
     *
     * @mbg.generated
     */
    private String shopname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_shop.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_shop.shop_introduce
     *
     * @mbg.generated
     */
    private String shopIntroduce;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_shop.service_mobile
     *
     * @mbg.generated
     */
    private String serviceMobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_shop.work_time
     *
     * @mbg.generated
     */
    private LocalDateTime workTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_shop.workimg_url
     *
     * @mbg.generated
     */
    private String workimgUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_shop.storefrontimg_url
     *
     * @mbg.generated
     */
    private String storefrontimgUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_shop.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_shop.add_time
     *
     * @mbg.generated
     */
    private LocalDateTime addTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_shop.id
     *
     * @return the value of litemall_shop.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_shop.id
     *
     * @param id the value for litemall_shop.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_shop.industry_classify
     *
     * @return the value of litemall_shop.industry_classify
     *
     * @mbg.generated
     */
    public Integer[] getIndustryClassify() {
        return industryClassify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_shop.industry_classify
     *
     * @param industryClassify the value for litemall_shop.industry_classify
     *
     * @mbg.generated
     */
    public void setIndustryClassify(Integer[] industryClassify) {
        this.industryClassify = industryClassify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_shop.region
     *
     * @return the value of litemall_shop.region
     *
     * @mbg.generated
     */
    public String getRegion() {
        return region;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_shop.region
     *
     * @param region the value for litemall_shop.region
     *
     * @mbg.generated
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_shop.shop_facility
     *
     * @return the value of litemall_shop.shop_facility
     *
     * @mbg.generated
     */
    public Integer[] getShopFacility() {
        return shopFacility;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_shop.shop_facility
     *
     * @param shopFacility the value for litemall_shop.shop_facility
     *
     * @mbg.generated
     */
    public void setShopFacility(Integer[] shopFacility) {
        this.shopFacility = shopFacility;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_shop.address
     *
     * @return the value of litemall_shop.address
     *
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_shop.address
     *
     * @param address the value for litemall_shop.address
     *
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_shop.url
     *
     * @return the value of litemall_shop.url
     *
     * @mbg.generated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_shop.url
     *
     * @param url the value for litemall_shop.url
     *
     * @mbg.generated
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_shop.shopname
     *
     * @return the value of litemall_shop.shopname
     *
     * @mbg.generated
     */
    public String getShopname() {
        return shopname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_shop.shopname
     *
     * @param shopname the value for litemall_shop.shopname
     *
     * @mbg.generated
     */
    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_shop.username
     *
     * @return the value of litemall_shop.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_shop.username
     *
     * @param username the value for litemall_shop.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_shop.shop_introduce
     *
     * @return the value of litemall_shop.shop_introduce
     *
     * @mbg.generated
     */
    public String getShopIntroduce() {
        return shopIntroduce;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_shop.shop_introduce
     *
     * @param shopIntroduce the value for litemall_shop.shop_introduce
     *
     * @mbg.generated
     */
    public void setShopIntroduce(String shopIntroduce) {
        this.shopIntroduce = shopIntroduce;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_shop.service_mobile
     *
     * @return the value of litemall_shop.service_mobile
     *
     * @mbg.generated
     */
    public String getServiceMobile() {
        return serviceMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_shop.service_mobile
     *
     * @param serviceMobile the value for litemall_shop.service_mobile
     *
     * @mbg.generated
     */
    public void setServiceMobile(String serviceMobile) {
        this.serviceMobile = serviceMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_shop.work_time
     *
     * @return the value of litemall_shop.work_time
     *
     * @mbg.generated
     */
    public LocalDateTime getWorkTime() {
        return workTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_shop.work_time
     *
     * @param workTime the value for litemall_shop.work_time
     *
     * @mbg.generated
     */
    public void setWorkTime(LocalDateTime workTime) {
        this.workTime = workTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_shop.workimg_url
     *
     * @return the value of litemall_shop.workimg_url
     *
     * @mbg.generated
     */
    public String getWorkimgUrl() {
        return workimgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_shop.workimg_url
     *
     * @param workimgUrl the value for litemall_shop.workimg_url
     *
     * @mbg.generated
     */
    public void setWorkimgUrl(String workimgUrl) {
        this.workimgUrl = workimgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_shop.storefrontimg_url
     *
     * @return the value of litemall_shop.storefrontimg_url
     *
     * @mbg.generated
     */
    public String getStorefrontimgUrl() {
        return storefrontimgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_shop.storefrontimg_url
     *
     * @param storefrontimgUrl the value for litemall_shop.storefrontimg_url
     *
     * @mbg.generated
     */
    public void setStorefrontimgUrl(String storefrontimgUrl) {
        this.storefrontimgUrl = storefrontimgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_shop.password
     *
     * @return the value of litemall_shop.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_shop.password
     *
     * @param password the value for litemall_shop.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_shop.add_time
     *
     * @return the value of litemall_shop.add_time
     *
     * @mbg.generated
     */
    public LocalDateTime getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_shop.add_time
     *
     * @param addTime the value for litemall_shop.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_shop
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", industryClassify=").append(industryClassify);
        sb.append(", region=").append(region);
        sb.append(", shopFacility=").append(shopFacility);
        sb.append(", address=").append(address);
        sb.append(", url=").append(url);
        sb.append(", shopname=").append(shopname);
        sb.append(", username=").append(username);
        sb.append(", shopIntroduce=").append(shopIntroduce);
        sb.append(", serviceMobile=").append(serviceMobile);
        sb.append(", workTime=").append(workTime);
        sb.append(", workimgUrl=").append(workimgUrl);
        sb.append(", storefrontimgUrl=").append(storefrontimgUrl);
        sb.append(", password=").append(password);
        sb.append(", addTime=").append(addTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_shop
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        LitemallShop other = (LitemallShop) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (Arrays.equals(this.getIndustryClassify(), other.getIndustryClassify()))
            && (this.getRegion() == null ? other.getRegion() == null : this.getRegion().equals(other.getRegion()))
            && (Arrays.equals(this.getShopFacility(), other.getShopFacility()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getShopname() == null ? other.getShopname() == null : this.getShopname().equals(other.getShopname()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getShopIntroduce() == null ? other.getShopIntroduce() == null : this.getShopIntroduce().equals(other.getShopIntroduce()))
            && (this.getServiceMobile() == null ? other.getServiceMobile() == null : this.getServiceMobile().equals(other.getServiceMobile()))
            && (this.getWorkTime() == null ? other.getWorkTime() == null : this.getWorkTime().equals(other.getWorkTime()))
            && (this.getWorkimgUrl() == null ? other.getWorkimgUrl() == null : this.getWorkimgUrl().equals(other.getWorkimgUrl()))
            && (this.getStorefrontimgUrl() == null ? other.getStorefrontimgUrl() == null : this.getStorefrontimgUrl().equals(other.getStorefrontimgUrl()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_shop
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + (Arrays.hashCode(getIndustryClassify()));
        result = prime * result + ((getRegion() == null) ? 0 : getRegion().hashCode());
        result = prime * result + (Arrays.hashCode(getShopFacility()));
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getShopname() == null) ? 0 : getShopname().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getShopIntroduce() == null) ? 0 : getShopIntroduce().hashCode());
        result = prime * result + ((getServiceMobile() == null) ? 0 : getServiceMobile().hashCode());
        result = prime * result + ((getWorkTime() == null) ? 0 : getWorkTime().hashCode());
        result = prime * result + ((getWorkimgUrl() == null) ? 0 : getWorkimgUrl().hashCode());
        result = prime * result + ((getStorefrontimgUrl() == null) ? 0 : getStorefrontimgUrl().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table litemall_shop
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        industryClassify("industry_classify", "industryClassify", "VARCHAR", false),
        region("region", "region", "VARCHAR", false),
        shopFacility("shop_facility", "shopFacility", "VARCHAR", false),
        address("address", "address", "VARCHAR", false),
        url("url", "url", "VARCHAR", false),
        shopname("shopname", "shopname", "VARCHAR", false),
        username("username", "username", "VARCHAR", false),
        shopIntroduce("shop_introduce", "shopIntroduce", "VARCHAR", false),
        serviceMobile("service_mobile", "serviceMobile", "VARCHAR", false),
        workTime("work_time", "workTime", "TIMESTAMP", false),
        workimgUrl("workimg_url", "workimgUrl", "VARCHAR", false),
        storefrontimgUrl("storefrontimg_url", "storefrontimgUrl", "VARCHAR", false),
        password("password", "password", "VARCHAR", true),
        addTime("add_time", "addTime", "TIMESTAMP", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_shop
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_shop
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_shop
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_shop
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_shop
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_shop
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_shop
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_shop
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_shop
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_shop
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_shop
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_shop
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_shop
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_shop
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_shop
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }
    }
}