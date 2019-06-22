package sion.my.caipiao.bean;

import java.util.List;

public class LotteryRecord {


    /**
     * reason : 查询成功
     * result : {"lotteryResList":[{"lottery_id":"ssq","lottery_res":"01,08,19,24,29,30,04","lottery_no":"19071","lottery_date":"2019-06-20","lottery_exdate":"2019-08-18","lottery_sale_amount":"338,921,834","lottery_pool_amount":"779,942,491"},{"lottery_id":"ssq","lottery_res":"06,15,18,19,24,32,09","lottery_no":"19070","lottery_date":"2019-06-18","lottery_exdate":"2019-08-16","lottery_sale_amount":"335,727,814","lottery_pool_amount":"839,590,047"},{"lottery_id":"ssq","lottery_res":"06,11,16,19,21,25,01","lottery_no":"19069","lottery_date":"2019-06-16","lottery_exdate":"2019-08-14","lottery_sale_amount":"370,103,190","lottery_pool_amount":"813,208,375"},{"lottery_id":"ssq","lottery_res":"03,14,20,24,26,33,10","lottery_no":"19068","lottery_date":"2019-06-13","lottery_exdate":"2019-08-11","lottery_sale_amount":"331,635,522","lottery_pool_amount":"802,934,315"},{"lottery_id":"ssq","lottery_res":"04,06,08,11,30,33,11","lottery_no":"19067","lottery_date":"2019-06-11","lottery_exdate":"2019-08-09","lottery_sale_amount":"330,381,956","lottery_pool_amount":"781,887,228"},{"lottery_id":"ssq","lottery_res":"01,14,17,20,22,32,04","lottery_no":"19066","lottery_date":"2019-06-09","lottery_exdate":"2019-08-07","lottery_sale_amount":"354,505,682","lottery_pool_amount":"765,994,853"},{"lottery_id":"ssq","lottery_res":"06,09,11,15,20,26,10","lottery_no":"19065","lottery_date":"2019-06-06","lottery_exdate":"2019-08-04","lottery_sale_amount":"327,400,036","lottery_pool_amount":"737,867,862"},{"lottery_id":"ssq","lottery_res":"12,20,24,25,30,33,12","lottery_no":"19064","lottery_date":"2019-06-04","lottery_exdate":"2019-08-02","lottery_sale_amount":"331,639,006","lottery_pool_amount":"743,421,022"},{"lottery_id":"ssq","lottery_res":"01,14,19,22,29,31,16","lottery_no":"19063","lottery_date":"2019-06-02","lottery_exdate":"2019-07-31","lottery_sale_amount":"361,222,550","lottery_pool_amount":"718,713,061"},{"lottery_id":"ssq","lottery_res":"07,13,16,23,26,30,01","lottery_no":"19062","lottery_date":"2019-05-30","lottery_exdate":"2019-07-28","lottery_sale_amount":"339,468,976","lottery_pool_amount":"684,734,277"}],"page":1,"pageSize":10,"totalPage":243}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * lotteryResList : [{"lottery_id":"ssq","lottery_res":"01,08,19,24,29,30,04","lottery_no":"19071","lottery_date":"2019-06-20","lottery_exdate":"2019-08-18","lottery_sale_amount":"338,921,834","lottery_pool_amount":"779,942,491"},{"lottery_id":"ssq","lottery_res":"06,15,18,19,24,32,09","lottery_no":"19070","lottery_date":"2019-06-18","lottery_exdate":"2019-08-16","lottery_sale_amount":"335,727,814","lottery_pool_amount":"839,590,047"},{"lottery_id":"ssq","lottery_res":"06,11,16,19,21,25,01","lottery_no":"19069","lottery_date":"2019-06-16","lottery_exdate":"2019-08-14","lottery_sale_amount":"370,103,190","lottery_pool_amount":"813,208,375"},{"lottery_id":"ssq","lottery_res":"03,14,20,24,26,33,10","lottery_no":"19068","lottery_date":"2019-06-13","lottery_exdate":"2019-08-11","lottery_sale_amount":"331,635,522","lottery_pool_amount":"802,934,315"},{"lottery_id":"ssq","lottery_res":"04,06,08,11,30,33,11","lottery_no":"19067","lottery_date":"2019-06-11","lottery_exdate":"2019-08-09","lottery_sale_amount":"330,381,956","lottery_pool_amount":"781,887,228"},{"lottery_id":"ssq","lottery_res":"01,14,17,20,22,32,04","lottery_no":"19066","lottery_date":"2019-06-09","lottery_exdate":"2019-08-07","lottery_sale_amount":"354,505,682","lottery_pool_amount":"765,994,853"},{"lottery_id":"ssq","lottery_res":"06,09,11,15,20,26,10","lottery_no":"19065","lottery_date":"2019-06-06","lottery_exdate":"2019-08-04","lottery_sale_amount":"327,400,036","lottery_pool_amount":"737,867,862"},{"lottery_id":"ssq","lottery_res":"12,20,24,25,30,33,12","lottery_no":"19064","lottery_date":"2019-06-04","lottery_exdate":"2019-08-02","lottery_sale_amount":"331,639,006","lottery_pool_amount":"743,421,022"},{"lottery_id":"ssq","lottery_res":"01,14,19,22,29,31,16","lottery_no":"19063","lottery_date":"2019-06-02","lottery_exdate":"2019-07-31","lottery_sale_amount":"361,222,550","lottery_pool_amount":"718,713,061"},{"lottery_id":"ssq","lottery_res":"07,13,16,23,26,30,01","lottery_no":"19062","lottery_date":"2019-05-30","lottery_exdate":"2019-07-28","lottery_sale_amount":"339,468,976","lottery_pool_amount":"684,734,277"}]
         * page : 1
         * pageSize : 10
         * totalPage : 243
         */

        private int page;
        private int pageSize;
        private int totalPage;
        private List<LotteryResListBean> lotteryResList;

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public int getTotalPage() {
            return totalPage;
        }

        public void setTotalPage(int totalPage) {
            this.totalPage = totalPage;
        }

        public List<LotteryResListBean> getLotteryResList() {
            return lotteryResList;
        }

        public void setLotteryResList(List<LotteryResListBean> lotteryResList) {
            this.lotteryResList = lotteryResList;
        }

        public static class LotteryResListBean {
            /**
             * lottery_id : ssq
             * lottery_res : 01,08,19,24,29,30,04
             * lottery_no : 19071
             * lottery_date : 2019-06-20
             * lottery_exdate : 2019-08-18
             * lottery_sale_amount : 338,921,834
             * lottery_pool_amount : 779,942,491
             */

            private String lottery_id;
            private String lottery_res;
            private String lottery_no;
            private String lottery_date;
            private String lottery_exdate;
            private String lottery_sale_amount;
            private String lottery_pool_amount;

            public String getLottery_id() {
                return lottery_id;
            }

            public void setLottery_id(String lottery_id) {
                this.lottery_id = lottery_id;
            }

            public String getLottery_res() {
                return lottery_res;
            }

            public void setLottery_res(String lottery_res) {
                this.lottery_res = lottery_res;
            }

            public String getLottery_no() {
                return lottery_no;
            }

            public void setLottery_no(String lottery_no) {
                this.lottery_no = lottery_no;
            }

            public String getLottery_date() {
                return lottery_date;
            }

            public void setLottery_date(String lottery_date) {
                this.lottery_date = lottery_date;
            }

            public String getLottery_exdate() {
                return lottery_exdate;
            }

            public void setLottery_exdate(String lottery_exdate) {
                this.lottery_exdate = lottery_exdate;
            }

            public String getLottery_sale_amount() {
                return lottery_sale_amount;
            }

            public void setLottery_sale_amount(String lottery_sale_amount) {
                this.lottery_sale_amount = lottery_sale_amount;
            }

            public String getLottery_pool_amount() {
                return lottery_pool_amount;
            }

            public void setLottery_pool_amount(String lottery_pool_amount) {
                this.lottery_pool_amount = lottery_pool_amount;
            }
        }
    }
}
