const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmofyp4/",
            name: "ssmofyp4",
            // 退出到Home page链接
            indexUrl: 'http://localhost:8080/ssmofyp4/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "World Cup Tour APP"
        } 
    }
}
export default base
