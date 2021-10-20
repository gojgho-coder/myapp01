<template>
  <ion-page>
    <ion-header>
      <ion-toolbar>
        <ion-title>LOGIN</ion-title>
      </ion-toolbar>
    </ion-header>
    <ion-content :fullscreen="true">

      <div class="container login-container">
        <div class="row">
          <div class="col-md-6 login-form-1">
            <h3>로그인 창</h3>
            <form>
              <div class="form-group">
                <input type="text" class="form-control" placeholder="ID *" value="" />
              </div>
              <div class="form-group">
                <input type="password" class="form-control" placeholder="Password *" value="" />
              </div>
              <div class="form-group">
                <input type="button" class="btnSubmit" value="로그인" v-on:click="checkLogin" />
                <input type="button" class="btnSubmit" value="회원가입" v-on:click="signUp" />
              </div>
              <div class="form-group">
                <a href="#" class="ForgetPwd">Forget Password?</a>
              </div>
            </form>
          </div>

        </div>
      </div>
    </ion-content>




  </ion-page>
</template>




<script>

import {IonContent, IonHeader, IonPage, IonTitle, IonToolbar} from "@ionic/vue";
import '../../css/login.css';

export default {
  name: "login",
     components: {IonContent,  IonHeader, IonToolbar, IonTitle, IonPage },
  methods:{
    checkLogin(){
      alert("test")
      window.location.replace('/tabs')
    },
    signUp(){
      window.location.replace('/signUp')
    }
  }
}
</script>

<style scoped>

</style>