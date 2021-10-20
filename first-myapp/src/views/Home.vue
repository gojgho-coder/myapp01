<template>
  <ion-page>
    <ion-header>
      <ion-toolbar>
        <ion-title>홈</ion-title>
      </ion-toolbar>
    </ion-header>
    <ion-content :fullscreen="true">
      <ion-header collapse="condense">
        <ion-toolbar>
          <ion-title size="large">Home</ion-title>
        </ion-toolbar>
      </ion-header>

      <div id="container">
       home
      </div>

    </ion-content>
  </ion-page>
</template>

<script>
import ExploreContainer from "../components/ExploreContainer";
import {IonContent, IonHeader, IonPage, IonTitle, IonToolbar} from "@ionic/vue";

export default {
  name: "Home",
  components: {  IonHeader, IonToolbar, IonTitle, IonContent, IonPage }
}
</script>

<style scoped>

</style>