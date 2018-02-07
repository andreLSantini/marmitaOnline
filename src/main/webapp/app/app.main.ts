import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import { ProdConfig } from './blocks/config/prod.config';
import { MarmitaOnlineAppModule } from './app.module';

ProdConfig();

if (module['hot']) {
    module['hot'].accept();
}

platformBrowserDynamic().bootstrapModule(MarmitaOnlineAppModule)
.then((success) => console.log(`Application started`))
.catch((err) => console.error(err));
