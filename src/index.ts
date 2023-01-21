import { registerPlugin } from '@capacitor/core';

import type { MDMAppConfigPlugin } from './definitions';

const MDMAppConfig = registerPlugin<MDMAppConfigPlugin>(
  'MDMAppConfig',
  {},
);

export * from './definitions';
export { MDMAppConfig };
