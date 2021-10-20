<template>
  <ion-page>
    <ion-header>
      <ion-toolbar>
        <ion-title>은행</ion-title>
      </ion-toolbar>
    </ion-header>
    <ion-content :fullscreen="true">
      <ion-header collapse="condense">
        <ion-toolbar>
          <ion-title size="large">은행</ion-title>
        </ion-toolbar>
      </ion-header>
      
<!--      <ExploreContainer2 name="은행" />-->
    </ion-content>
  </ion-page>
</template>

<script lang="ts">
import { IonPage, IonHeader, IonToolbar, IonTitle, IonContent } from '@ionic/vue';
import ExploreContainer2 from '@/components/com_login.vue';
export default  {
  name: 'Tab2',
  components: { IonHeader, IonToolbar, IonTitle, IonContent, IonPage }
}
</script>