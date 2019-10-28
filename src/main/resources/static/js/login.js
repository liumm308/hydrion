/**
 *@author  liumm308
 *@data  2019/10/28 16:44
 *@mail xidian_liu@163.com
 */

function loginIn() {
    console.log("----------");


   /* $axios({
        method: 'post',
        url: 'api/oauth/token',
        params: {
            "username": loginCode,
            "password": password,
            "grant_type": "password",
            "client_id":"CloudClientId",
            "client_secret":"secret"
            // "scope": "all"
        },
    }).then(function(response){
        axios.defaults.headers.common['Authorization'] = 'bearer '+ response.data.access_token;
        that.getLoginInfo(that,response.data.access_token,response.data.refresh_token,router);
    }).catch(function(error){
        that.showMessage = '用户名或密码错误!';
        // that.$Notice.error({title: '用户名或密码错误！',});
    });
*/

    $.ajax({
        type: "post",
        url: "/oauth/token",
        async: false,
        data: {
            username:$("#username").val(),
            password:$("#password").val(),
            "grant_type": "password",
            "client_id":"CloudClientId",
            "client_secret":"secret"
        },
        dataType: "json",
        success: function (data) {
            alert("success")
        },
        error: function () {
            alert("请求失败")
        }
    });

}